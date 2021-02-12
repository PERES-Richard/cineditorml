/*
 * generated by Xtext 2.14.0
 */
package polytech.spaceteam.cineditor.validation

import org.eclipse.xtext.validation.Check
import CinEditorML.CinEditorMLPackage
import java.util.regex.Pattern
import CinEditorML.HexadecimalColor
import CinEditorML.Movie
import java.util.HashSet
import CinEditorML.Position
import CinEditorML.ItemPositionString
import CinEditorML.AudioElement

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class CinEditorValidator extends AbstractCinEditorValidator {
	
	public static val INVALID_NAME = 'invalidName'
	public static val INVALID_COLOR = 'invalidColor'
	public static val INVALID_DURATION = 'invalidDuration'
	public static val INVALID_DIMENSION = 'invalidDimension'
	public static val INVALID_FPS = 'invalidFps'

	@Check
	def checkElementNames(Movie movie) {
		if (movie.dimension.width < 0) {
			error('Movie width must be > 0', 
					CinEditorMLPackage.Literals.MOVIE__DIMENSION,
					INVALID_DIMENSION)
		}
		if (movie.dimension.height < 0) {
			error('Movie height must be > 0', 
					CinEditorMLPackage.Literals.MOVIE__DIMENSION,
					INVALID_DIMENSION)
		}
		
		if (movie.fps <= 0) {
			error('FPS must be > 0', 
					CinEditorMLPackage.Literals.MOVIE__FPS,
					INVALID_FPS)
		} else if (movie.fps > 244) {
			error('Hum there is too much FPS', 
					CinEditorMLPackage.Literals.MOVIE__FPS,
					INVALID_FPS)
		}
		
		val names = new HashSet<String>();
		for (var i = 0; i < movie.layers.size; i++) {
			val layer = movie.layers.get(i);
			for (var j = 0; j < layer.elements.size; j++) {
				val element = layer.elements.get(j);
				if (!names.contains(element.name)) {
					names.add(element.name);
				} else {
					error('Element name "' + element.name + '" must be unique', 
					CinEditorMLPackage.Literals.MOVIE__LAYERS,
					i,
					INVALID_NAME)
				}
			}
		}
	}

	@Check
	def checkPosition(Position position) {
		if (position.x instanceof ItemPositionString) {
			val positionX = (position.x as ItemPositionString).position;
			if (!positionX.equals("center") && !positionX.equals("left") && !positionX.equals("right")) {
				error('Position x must be center, left or right', CinEditorMLPackage.Literals.POSITION__X);
			}
		}
		if (position.y instanceof ItemPositionString) {
			val positionY = (position.y as ItemPositionString).position;
			if (!positionY.equals("center") && !positionY.equals("bottom") && !positionY.equals("top")) {
				error('Position y must be center, top or bottom', CinEditorMLPackage.Literals.POSITION__Y);
			}
		}
	}
	
	@Check
	def checkAudio(AudioElement element) {
		if (element.volume > 1 || element.volume < 0) {
			error('Volume must be between 0 and 1', CinEditorMLPackage.Literals.AUDIO_ELEMENT__VOLUME);
		}
	}
	
	@Check
	def checkShapeColor(HexadecimalColor color) {
		val p = Pattern.compile("^([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$");      
		val m = p.matcher(color.hexadecimalValue) ;    
 		var b = m.matches();
 		if (!b) {
 			error('Shape color must be in hexadecimal', 
					CinEditorMLPackage.Literals.HEXADECIMAL_COLOR__HEXADECIMAL_VALUE,
					INVALID_COLOR)
 		}
	}
	
}
