/**
 * generated by Xtext 2.14.0
 */
package polytech.spaceteam.cineditor.validation;

import CinEditorML.AudioElement;
import CinEditorML.CinEditorMLPackage;
import CinEditorML.Effect;
import CinEditorML.Element;
import CinEditorML.GraphicalElement;
import CinEditorML.HexadecimalColor;
import CinEditorML.ItemPosition;
import CinEditorML.ItemPositionString;
import CinEditorML.Layer;
import CinEditorML.Movie;
import CinEditorML.Position;
import CinEditorML.Video;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.xtext.validation.Check;
import polytech.spaceteam.cineditor.validation.AbstractCinEditorValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class CinEditorValidator extends AbstractCinEditorValidator {
  public final static String INVALID_NAME = "invalidName";
  
  public final static String INVALID_COLOR = "invalidColor";
  
  public final static String INVALID_DURATION = "invalidDuration";
  
  public final static String INVALID_DIMENSION = "invalidDimension";
  
  public final static String INVALID_FPS = "invalidFps";
  
  @Check
  public void checkElementNames(final Movie movie) {
    int _width = movie.getDimension().getWidth();
    boolean _lessThan = (_width < 0);
    if (_lessThan) {
      this.error("Movie width must be > 0", 
        CinEditorMLPackage.Literals.MOVIE__DIMENSION, 
        CinEditorValidator.INVALID_DIMENSION);
    }
    int _height = movie.getDimension().getHeight();
    boolean _lessThan_1 = (_height < 0);
    if (_lessThan_1) {
      this.error("Movie height must be > 0", 
        CinEditorMLPackage.Literals.MOVIE__DIMENSION, 
        CinEditorValidator.INVALID_DIMENSION);
    }
    int _fps = movie.getFps();
    boolean _lessEqualsThan = (_fps <= 0);
    if (_lessEqualsThan) {
      this.error("FPS must be > 0", 
        CinEditorMLPackage.Literals.MOVIE__FPS, 
        CinEditorValidator.INVALID_FPS);
    } else {
      int _fps_1 = movie.getFps();
      boolean _greaterThan = (_fps_1 > 244);
      if (_greaterThan) {
        this.error("Hum there is too much FPS", 
          CinEditorMLPackage.Literals.MOVIE__FPS, 
          CinEditorValidator.INVALID_FPS);
      }
    }
    final HashSet<String> names = new HashSet<String>();
    for (int i = 0; (i < movie.getLayers().size()); i++) {
      {
        final Layer layer = movie.getLayers().get(i);
        for (int j = 0; (j < layer.getElements().size()); j++) {
          {
            final Element element = layer.getElements().get(j);
            boolean _contains = names.contains(element.getName());
            boolean _not = (!_contains);
            if (_not) {
              names.add(element.getName());
            } else {
              String _name = element.getName();
              String _plus = ("Element name \"" + _name);
              String _plus_1 = (_plus + "\" must be unique");
              this.error(_plus_1, 
                CinEditorMLPackage.Literals.MOVIE__LAYERS, i, 
                CinEditorValidator.INVALID_NAME);
            }
          }
        }
      }
    }
  }
  
  @Check
  public void checkEffect(final Effect effect) {
    HashSet<String> set = new HashSet<String>();
    for (int i = 0; (i < effect.getElements().size()); i++) {
      {
        GraphicalElement element = effect.getElements().get(i);
        boolean _contains = set.contains(element.getName());
        boolean _not = (!_contains);
        if (_not) {
          set.add(element.getName());
        } else {
          this.error("An effect can be applied on an element only one time", 
            CinEditorMLPackage.Literals.EFFECT__ELEMENTS, i, 
            CinEditorValidator.INVALID_NAME);
        }
      }
    }
  }
  
  @Check
  public void checkPosition(final Position position) {
    ItemPosition _x = position.getX();
    if ((_x instanceof ItemPositionString)) {
      ItemPosition _x_1 = position.getX();
      final String positionX = ((ItemPositionString) _x_1).getPosition();
      if ((((!positionX.equals("center")) && (!positionX.equals("left"))) && (!positionX.equals("right")))) {
        this.error("Position x must be center, left or right", CinEditorMLPackage.Literals.POSITION__X);
      }
    }
    ItemPosition _y = position.getY();
    if ((_y instanceof ItemPositionString)) {
      ItemPosition _y_1 = position.getY();
      final String positionY = ((ItemPositionString) _y_1).getPosition();
      if ((((!positionY.equals("center")) && (!positionY.equals("bottom"))) && (!positionY.equals("top")))) {
        this.error("Position y must be center, top or bottom", CinEditorMLPackage.Literals.POSITION__Y);
      }
    }
  }
  
  @Check
  public void checkAudio(final AudioElement element) {
    if (((element.getVolume() > 1) || (element.getVolume() < 0))) {
      this.error("Volume must be between 0 and 1", CinEditorMLPackage.Literals.AUDIO_ELEMENT__VOLUME);
    }
  }
  
  @Check
  public void checkVideo(final Video element) {
    if (((element.getBeginCropTime() > (-1)) && (element.getDuration() < 0))) {
      this.error("To crop a video you must set the duration", CinEditorMLPackage.Literals.VIDEO__BEGIN_CROP_TIME);
    }
  }
  
  @Check
  public void checkShapeColor(final HexadecimalColor color) {
    final Pattern p = Pattern.compile("^([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$");
    final Matcher m = p.matcher(color.getHexadecimalValue());
    boolean b = m.matches();
    if ((!b)) {
      this.error("Shape color must be in hexadecimal", 
        CinEditorMLPackage.Literals.HEXADECIMAL_COLOR__HEXADECIMAL_VALUE, 
        CinEditorValidator.INVALID_COLOR);
    }
  }
}
