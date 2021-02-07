/*
 * generated by Xtext 2.14.0
 */
package polytech.spaceteam.cineditor.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import polytech.spaceteam.cineditor.ide.contentassist.antlr.internal.InternalCinEditorParser;
import polytech.spaceteam.cineditor.services.CinEditorGrammarAccess;

public class CinEditorParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CinEditorGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CinEditorGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getMovieAccess().getGroup(), "rule__Movie__Group__0");
			builder.put(grammarAccess.getLayerAccess().getGroup(), "rule__Layer__Group__0");
			builder.put(grammarAccess.getPositionAccess().getGroup(), "rule__Position__Group__0");
			builder.put(grammarAccess.getPositionAccess().getGroup_4(), "rule__Position__Group_4__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getTextAccess().getGroup(), "rule__Text__Group__0");
			builder.put(grammarAccess.getPictureAccess().getGroup(), "rule__Picture__Group__0");
			builder.put(grammarAccess.getVideoAccess().getGroup(), "rule__Video__Group__0");
			builder.put(grammarAccess.getFadeInAccess().getGroup(), "rule__FadeIn__Group__0");
			builder.put(grammarAccess.getFadeOutAccess().getGroup(), "rule__FadeOut__Group__0");
			builder.put(grammarAccess.getTranslateAccess().getGroup(), "rule__Translate__Group__0");
			builder.put(grammarAccess.getRectangleAccess().getGroup(), "rule__Rectangle__Group__0");
			builder.put(grammarAccess.getMovieAccess().getNameAssignment_1(), "rule__Movie__NameAssignment_1");
			builder.put(grammarAccess.getMovieAccess().getPositionAssignment_2(), "rule__Movie__PositionAssignment_2");
			builder.put(grammarAccess.getMovieAccess().getLayersAssignment_3(), "rule__Movie__LayersAssignment_3");
			builder.put(grammarAccess.getLayerAccess().getElementsAssignment_2(), "rule__Layer__ElementsAssignment_2");
			builder.put(grammarAccess.getPositionAccess().getWidthAssignment_1(), "rule__Position__WidthAssignment_1");
			builder.put(grammarAccess.getPositionAccess().getHeightAssignment_3(), "rule__Position__HeightAssignment_3");
			builder.put(grammarAccess.getPositionAccess().getXAssignment_4_1(), "rule__Position__XAssignment_4_1");
			builder.put(grammarAccess.getPositionAccess().getYAssignment_4_3(), "rule__Position__YAssignment_4_3");
			builder.put(grammarAccess.getTextAccess().getNameAssignment_1(), "rule__Text__NameAssignment_1");
			builder.put(grammarAccess.getTextAccess().getTextAssignment_3(), "rule__Text__TextAssignment_3");
			builder.put(grammarAccess.getTextAccess().getPositionAssignment_4(), "rule__Text__PositionAssignment_4");
			builder.put(grammarAccess.getTextAccess().getBeginTimeAssignment_6(), "rule__Text__BeginTimeAssignment_6");
			builder.put(grammarAccess.getTextAccess().getDurationAssignment_8(), "rule__Text__DurationAssignment_8");
			builder.put(grammarAccess.getPictureAccess().getNameAssignment_1(), "rule__Picture__NameAssignment_1");
			builder.put(grammarAccess.getPictureAccess().getUrlAssignment_4(), "rule__Picture__UrlAssignment_4");
			builder.put(grammarAccess.getPictureAccess().getPositionAssignment_6(), "rule__Picture__PositionAssignment_6");
			builder.put(grammarAccess.getPictureAccess().getBeginTimeAssignment_8(), "rule__Picture__BeginTimeAssignment_8");
			builder.put(grammarAccess.getPictureAccess().getDurationAssignment_10(), "rule__Picture__DurationAssignment_10");
			builder.put(grammarAccess.getVideoAccess().getNameAssignment_1(), "rule__Video__NameAssignment_1");
			builder.put(grammarAccess.getVideoAccess().getUrlAssignment_4(), "rule__Video__UrlAssignment_4");
			builder.put(grammarAccess.getVideoAccess().getBeginCropTimeAssignment_7(), "rule__Video__BeginCropTimeAssignment_7");
			builder.put(grammarAccess.getVideoAccess().getPositionAssignment_8(), "rule__Video__PositionAssignment_8");
			builder.put(grammarAccess.getVideoAccess().getBeginTimeAssignment_10(), "rule__Video__BeginTimeAssignment_10");
			builder.put(grammarAccess.getVideoAccess().getDurationAssignment_12(), "rule__Video__DurationAssignment_12");
			builder.put(grammarAccess.getFadeInAccess().getNameAssignment_1(), "rule__FadeIn__NameAssignment_1");
			builder.put(grammarAccess.getFadeInAccess().getBeginTimeAssignment_5(), "rule__FadeIn__BeginTimeAssignment_5");
			builder.put(grammarAccess.getFadeInAccess().getDurationAssignment_7(), "rule__FadeIn__DurationAssignment_7");
			builder.put(grammarAccess.getFadeInAccess().getElementAssignment_9(), "rule__FadeIn__ElementAssignment_9");
			builder.put(grammarAccess.getFadeOutAccess().getNameAssignment_1(), "rule__FadeOut__NameAssignment_1");
			builder.put(grammarAccess.getFadeOutAccess().getBeginTimeAssignment_5(), "rule__FadeOut__BeginTimeAssignment_5");
			builder.put(grammarAccess.getFadeOutAccess().getDurationAssignment_7(), "rule__FadeOut__DurationAssignment_7");
			builder.put(grammarAccess.getFadeOutAccess().getElementAssignment_9(), "rule__FadeOut__ElementAssignment_9");
			builder.put(grammarAccess.getTranslateAccess().getNameAssignment_1(), "rule__Translate__NameAssignment_1");
			builder.put(grammarAccess.getTranslateAccess().getPixelsToTranslateHorizontallyAssignment_5(), "rule__Translate__PixelsToTranslateHorizontallyAssignment_5");
			builder.put(grammarAccess.getTranslateAccess().getPixelsToTranslateVerticallyAssignment_7(), "rule__Translate__PixelsToTranslateVerticallyAssignment_7");
			builder.put(grammarAccess.getTranslateAccess().getBeginTimeAssignment_10(), "rule__Translate__BeginTimeAssignment_10");
			builder.put(grammarAccess.getTranslateAccess().getDurationAssignment_12(), "rule__Translate__DurationAssignment_12");
			builder.put(grammarAccess.getTranslateAccess().getElementAssignment_14(), "rule__Translate__ElementAssignment_14");
			builder.put(grammarAccess.getRectangleAccess().getNameAssignment_1(), "rule__Rectangle__NameAssignment_1");
			builder.put(grammarAccess.getRectangleAccess().getHexadecimalValueAssignment_3(), "rule__Rectangle__HexadecimalValueAssignment_3");
			builder.put(grammarAccess.getRectangleAccess().getPositionAssignment_4(), "rule__Rectangle__PositionAssignment_4");
			builder.put(grammarAccess.getRectangleAccess().getBeginTimeAssignment_6(), "rule__Rectangle__BeginTimeAssignment_6");
			builder.put(grammarAccess.getRectangleAccess().getDurationAssignment_8(), "rule__Rectangle__DurationAssignment_8");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CinEditorGrammarAccess grammarAccess;

	@Override
	protected InternalCinEditorParser createParser() {
		InternalCinEditorParser result = new InternalCinEditorParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CinEditorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CinEditorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}