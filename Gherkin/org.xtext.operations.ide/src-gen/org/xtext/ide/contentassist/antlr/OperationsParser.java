/*
 * generated by Xtext 2.26.0
 */
package org.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.ide.contentassist.antlr.internal.InternalOperationsParser;
import org.xtext.services.OperationsGrammarAccess;

public class OperationsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(OperationsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, OperationsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
			builder.put(grammarAccess.getRotateServoOperationAccess().getGroup(), "rule__RotateServoOperation__Group__0");
			builder.put(grammarAccess.getOperationalArmAccess().getGroup(), "rule__OperationalArm__Group__0");
			builder.put(grammarAccess.getNotLaterThanAccess().getGroup(), "rule__NotLaterThan__Group__0");
			builder.put(grammarAccess.getResultAccess().getGroup(), "rule__Result__Group__0");
			builder.put(grammarAccess.getRotateServoOperationAccess().getNameAssignment_0(), "rule__RotateServoOperation__NameAssignment_0");
			builder.put(grammarAccess.getOperationalArmAccess().getNameAssignment_0(), "rule__OperationalArm__NameAssignment_0");
			builder.put(grammarAccess.getNotLaterThanAccess().getNameAssignment_0(), "rule__NotLaterThan__NameAssignment_0");
			builder.put(grammarAccess.getResultAccess().getNameAssignment_0(), "rule__Result__NameAssignment_0");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private OperationsGrammarAccess grammarAccess;

	@Override
	protected InternalOperationsParser createParser() {
		InternalOperationsParser result = new InternalOperationsParser(null);
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

	public OperationsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OperationsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}