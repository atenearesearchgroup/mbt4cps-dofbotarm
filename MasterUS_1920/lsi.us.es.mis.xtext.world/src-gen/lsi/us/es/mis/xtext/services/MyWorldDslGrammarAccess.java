/*
 * generated by Xtext 2.21.0
 */
package lsi.us.es.mis.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyWorldDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class WorldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "lsi.us.es.mis.xtext.MyWorldDsl.World");
		private final Assignment cSpacesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cSpacesSpaceParserRuleCall_0 = (RuleCall)cSpacesAssignment.eContents().get(0);
		
		//World:
		//	spaces+=Space+;
		@Override public ParserRule getRule() { return rule; }
		
		//spaces+=Space+
		public Assignment getSpacesAssignment() { return cSpacesAssignment; }
		
		//Space
		public RuleCall getSpacesSpaceParserRuleCall_0() { return cSpacesSpaceParserRuleCall_0; }
	}
	public class SpaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "lsi.us.es.mis.xtext.MyWorldDsl.Space");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cContinentParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWaterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Space:
		//	Continent | Water;
		@Override public ParserRule getRule() { return rule; }
		
		//Continent | Water
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Continent
		public RuleCall getContinentParserRuleCall_0() { return cContinentParserRuleCall_0; }
		
		//Water
		public RuleCall getWaterParserRuleCall_1() { return cWaterParserRuleCall_1; }
	}
	public class WaterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "lsi.us.es.mis.xtext.MyWorldDsl.Water");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cOceanParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLakeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSeaParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Water:
		//	Ocean | Lake | Sea;
		@Override public ParserRule getRule() { return rule; }
		
		//Ocean | Lake | Sea
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Ocean
		public RuleCall getOceanParserRuleCall_0() { return cOceanParserRuleCall_0; }
		
		//Lake
		public RuleCall getLakeParserRuleCall_1() { return cLakeParserRuleCall_1; }
		
		//Sea
		public RuleCall getSeaParserRuleCall_2() { return cSeaParserRuleCall_2; }
	}
	public class OceanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "lsi.us.es.mis.xtext.MyWorldDsl.Ocean");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOceanKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cAreaSqKmKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAreaAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAreaDOUBLETerminalRuleCall_4_0 = (RuleCall)cAreaAssignment_4.eContents().get(0);
		private final Keyword cVolumeCuKmKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCkAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCkDOUBLETerminalRuleCall_6_0 = (RuleCall)cCkAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Ocean:
		//	'Ocean' name=ID
		//	'{'
		//	'area (sq km):' area=DOUBLE
		//	'volume (cu km):' ck=DOUBLE
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Ocean' name=ID '{' 'area (sq km):' area=DOUBLE 'volume (cu km):' ck=DOUBLE '}'
		public Group getGroup() { return cGroup; }
		
		//'Ocean'
		public Keyword getOceanKeyword_0() { return cOceanKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'area (sq km):'
		public Keyword getAreaSqKmKeyword_3() { return cAreaSqKmKeyword_3; }
		
		//area=DOUBLE
		public Assignment getAreaAssignment_4() { return cAreaAssignment_4; }
		
		//DOUBLE
		public RuleCall getAreaDOUBLETerminalRuleCall_4_0() { return cAreaDOUBLETerminalRuleCall_4_0; }
		
		//'volume (cu km):'
		public Keyword getVolumeCuKmKeyword_5() { return cVolumeCuKmKeyword_5; }
		
		//ck=DOUBLE
		public Assignment getCkAssignment_6() { return cCkAssignment_6; }
		
		//DOUBLE
		public RuleCall getCkDOUBLETerminalRuleCall_6_0() { return cCkDOUBLETerminalRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class LakeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "lsi.us.es.mis.xtext.MyWorldDsl.Lake");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLakeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cAreaSqKmKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAreaAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAreaDOUBLETerminalRuleCall_4_0 = (RuleCall)cAreaAssignment_4.eContents().get(0);
		private final Keyword cVolumeCuKmKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCkAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCkDOUBLETerminalRuleCall_6_0 = (RuleCall)cCkAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Lake:
		//	'Lake' name=ID
		//	'{'
		//	'area (sq km):' area=DOUBLE
		//	'volume (cu km):' ck=DOUBLE
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Lake' name=ID '{' 'area (sq km):' area=DOUBLE 'volume (cu km):' ck=DOUBLE '}'
		public Group getGroup() { return cGroup; }
		
		//'Lake'
		public Keyword getLakeKeyword_0() { return cLakeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'area (sq km):'
		public Keyword getAreaSqKmKeyword_3() { return cAreaSqKmKeyword_3; }
		
		//area=DOUBLE
		public Assignment getAreaAssignment_4() { return cAreaAssignment_4; }
		
		//DOUBLE
		public RuleCall getAreaDOUBLETerminalRuleCall_4_0() { return cAreaDOUBLETerminalRuleCall_4_0; }
		
		//'volume (cu km):'
		public Keyword getVolumeCuKmKeyword_5() { return cVolumeCuKmKeyword_5; }
		
		//ck=DOUBLE
		public Assignment getCkAssignment_6() { return cCkAssignment_6; }
		
		//DOUBLE
		public RuleCall getCkDOUBLETerminalRuleCall_6_0() { return cCkDOUBLETerminalRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class SeaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "lsi.us.es.mis.xtext.MyWorldDsl.Sea");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSeaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cAreaSqKmKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAreaAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAreaDOUBLETerminalRuleCall_4_0 = (RuleCall)cAreaAssignment_4.eContents().get(0);
		private final Keyword cVolumeCuKmKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCkAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCkDOUBLETerminalRuleCall_6_0 = (RuleCall)cCkAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Sea:
		//	'Sea' name=ID
		//	'{'
		//	'area (sq km):' area=DOUBLE
		//	'volume (cu km):' ck=DOUBLE
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Sea' name=ID '{' 'area (sq km):' area=DOUBLE 'volume (cu km):' ck=DOUBLE '}'
		public Group getGroup() { return cGroup; }
		
		//'Sea'
		public Keyword getSeaKeyword_0() { return cSeaKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'area (sq km):'
		public Keyword getAreaSqKmKeyword_3() { return cAreaSqKmKeyword_3; }
		
		//area=DOUBLE
		public Assignment getAreaAssignment_4() { return cAreaAssignment_4; }
		
		//DOUBLE
		public RuleCall getAreaDOUBLETerminalRuleCall_4_0() { return cAreaDOUBLETerminalRuleCall_4_0; }
		
		//'volume (cu km):'
		public Keyword getVolumeCuKmKeyword_5() { return cVolumeCuKmKeyword_5; }
		
		//ck=DOUBLE
		public Assignment getCkAssignment_6() { return cCkAssignment_6; }
		
		//DOUBLE
		public RuleCall getCkDOUBLETerminalRuleCall_6_0() { return cCkDOUBLETerminalRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class ContinentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "lsi.us.es.mis.xtext.MyWorldDsl.Continent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContinentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cAreaSqKmKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAreaAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAreaDOUBLETerminalRuleCall_4_0 = (RuleCall)cAreaAssignment_4.eContents().get(0);
		private final Assignment cCountriesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cCountriesCountryParserRuleCall_5_0 = (RuleCall)cCountriesAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Continent:
		//	'Continent' name=ID
		//	'{'
		//	'area (sq km):' area=DOUBLE
		//	countries+=Country+
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Continent' name=ID '{' 'area (sq km):' area=DOUBLE countries+=Country+ '}'
		public Group getGroup() { return cGroup; }
		
		//'Continent'
		public Keyword getContinentKeyword_0() { return cContinentKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'area (sq km):'
		public Keyword getAreaSqKmKeyword_3() { return cAreaSqKmKeyword_3; }
		
		//area=DOUBLE
		public Assignment getAreaAssignment_4() { return cAreaAssignment_4; }
		
		//DOUBLE
		public RuleCall getAreaDOUBLETerminalRuleCall_4_0() { return cAreaDOUBLETerminalRuleCall_4_0; }
		
		//countries+=Country+
		public Assignment getCountriesAssignment_5() { return cCountriesAssignment_5; }
		
		//Country
		public RuleCall getCountriesCountryParserRuleCall_5_0() { return cCountriesCountryParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class CountryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "lsi.us.es.mis.xtext.MyWorldDsl.Country");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCountryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cAreaSqKmKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAreaAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAreaDOUBLETerminalRuleCall_4_0 = (RuleCall)cAreaAssignment_4.eContents().get(0);
		private final Assignment cPeacefulAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final Keyword cPeacefulPeacefulKeyword_5_0 = (Keyword)cPeacefulAssignment_5.eContents().get(0);
		private final Keyword cPopulationKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cPopulationAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cPopulationDOUBLETerminalRuleCall_7_0 = (RuleCall)cPopulationAssignment_7.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cBordersKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cBordersAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final CrossReference cBordersCountryCrossReference_8_1_0 = (CrossReference)cBordersAssignment_8_1.eContents().get(0);
		private final RuleCall cBordersCountryIDTerminalRuleCall_8_1_0_1 = (RuleCall)cBordersCountryCrossReference_8_1_0.eContents().get(1);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cWashedByKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cWashedByAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final CrossReference cWashedByWaterCrossReference_9_1_0 = (CrossReference)cWashedByAssignment_9_1.eContents().get(0);
		private final RuleCall cWashedByWaterIDTerminalRuleCall_9_1_0_1 = (RuleCall)cWashedByWaterCrossReference_9_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//Country:
		//	'Country' name=ID
		//	'{'
		//	'area (sq km):' area=DOUBLE
		//	peaceful?='peaceful'?
		//	'population:' population=DOUBLE ('borders:' borders+=[Country]+)? ('washedBy:' washedBy+=[Water]*)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Country' name=ID '{' 'area (sq km):' area=DOUBLE peaceful?='peaceful'? 'population:' population=DOUBLE ('borders:'
		//borders+=[Country]+)? ('washedBy:' washedBy+=[Water]*)* '}'
		public Group getGroup() { return cGroup; }
		
		//'Country'
		public Keyword getCountryKeyword_0() { return cCountryKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'area (sq km):'
		public Keyword getAreaSqKmKeyword_3() { return cAreaSqKmKeyword_3; }
		
		//area=DOUBLE
		public Assignment getAreaAssignment_4() { return cAreaAssignment_4; }
		
		//DOUBLE
		public RuleCall getAreaDOUBLETerminalRuleCall_4_0() { return cAreaDOUBLETerminalRuleCall_4_0; }
		
		//peaceful?='peaceful'?
		public Assignment getPeacefulAssignment_5() { return cPeacefulAssignment_5; }
		
		//'peaceful'
		public Keyword getPeacefulPeacefulKeyword_5_0() { return cPeacefulPeacefulKeyword_5_0; }
		
		//'population:'
		public Keyword getPopulationKeyword_6() { return cPopulationKeyword_6; }
		
		//population=DOUBLE
		public Assignment getPopulationAssignment_7() { return cPopulationAssignment_7; }
		
		//DOUBLE
		public RuleCall getPopulationDOUBLETerminalRuleCall_7_0() { return cPopulationDOUBLETerminalRuleCall_7_0; }
		
		//('borders:' borders+=[Country]+)?
		public Group getGroup_8() { return cGroup_8; }
		
		//'borders:'
		public Keyword getBordersKeyword_8_0() { return cBordersKeyword_8_0; }
		
		//borders+=[Country]+
		public Assignment getBordersAssignment_8_1() { return cBordersAssignment_8_1; }
		
		//[Country]
		public CrossReference getBordersCountryCrossReference_8_1_0() { return cBordersCountryCrossReference_8_1_0; }
		
		//ID
		public RuleCall getBordersCountryIDTerminalRuleCall_8_1_0_1() { return cBordersCountryIDTerminalRuleCall_8_1_0_1; }
		
		//('washedBy:' washedBy+=[Water]*)*
		public Group getGroup_9() { return cGroup_9; }
		
		//'washedBy:'
		public Keyword getWashedByKeyword_9_0() { return cWashedByKeyword_9_0; }
		
		//washedBy+=[Water]*
		public Assignment getWashedByAssignment_9_1() { return cWashedByAssignment_9_1; }
		
		//[Water]
		public CrossReference getWashedByWaterCrossReference_9_1_0() { return cWashedByWaterCrossReference_9_1_0; }
		
		//ID
		public RuleCall getWashedByWaterIDTerminalRuleCall_9_1_0_1() { return cWashedByWaterIDTerminalRuleCall_9_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}
	
	
	private final WorldElements pWorld;
	private final SpaceElements pSpace;
	private final WaterElements pWater;
	private final OceanElements pOcean;
	private final LakeElements pLake;
	private final SeaElements pSea;
	private final ContinentElements pContinent;
	private final CountryElements pCountry;
	private final TerminalRule tDOUBLE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyWorldDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pWorld = new WorldElements();
		this.pSpace = new SpaceElements();
		this.pWater = new WaterElements();
		this.pOcean = new OceanElements();
		this.pLake = new LakeElements();
		this.pSea = new SeaElements();
		this.pContinent = new ContinentElements();
		this.pCountry = new CountryElements();
		this.tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "lsi.us.es.mis.xtext.MyWorldDsl.DOUBLE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("lsi.us.es.mis.xtext.MyWorldDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//World:
	//	spaces+=Space+;
	public WorldElements getWorldAccess() {
		return pWorld;
	}
	
	public ParserRule getWorldRule() {
		return getWorldAccess().getRule();
	}
	
	//Space:
	//	Continent | Water;
	public SpaceElements getSpaceAccess() {
		return pSpace;
	}
	
	public ParserRule getSpaceRule() {
		return getSpaceAccess().getRule();
	}
	
	//Water:
	//	Ocean | Lake | Sea;
	public WaterElements getWaterAccess() {
		return pWater;
	}
	
	public ParserRule getWaterRule() {
		return getWaterAccess().getRule();
	}
	
	//Ocean:
	//	'Ocean' name=ID
	//	'{'
	//	'area (sq km):' area=DOUBLE
	//	'volume (cu km):' ck=DOUBLE
	//	'}';
	public OceanElements getOceanAccess() {
		return pOcean;
	}
	
	public ParserRule getOceanRule() {
		return getOceanAccess().getRule();
	}
	
	//Lake:
	//	'Lake' name=ID
	//	'{'
	//	'area (sq km):' area=DOUBLE
	//	'volume (cu km):' ck=DOUBLE
	//	'}';
	public LakeElements getLakeAccess() {
		return pLake;
	}
	
	public ParserRule getLakeRule() {
		return getLakeAccess().getRule();
	}
	
	//Sea:
	//	'Sea' name=ID
	//	'{'
	//	'area (sq km):' area=DOUBLE
	//	'volume (cu km):' ck=DOUBLE
	//	'}';
	public SeaElements getSeaAccess() {
		return pSea;
	}
	
	public ParserRule getSeaRule() {
		return getSeaAccess().getRule();
	}
	
	//Continent:
	//	'Continent' name=ID
	//	'{'
	//	'area (sq km):' area=DOUBLE
	//	countries+=Country+
	//	'}';
	public ContinentElements getContinentAccess() {
		return pContinent;
	}
	
	public ParserRule getContinentRule() {
		return getContinentAccess().getRule();
	}
	
	//Country:
	//	'Country' name=ID
	//	'{'
	//	'area (sq km):' area=DOUBLE
	//	peaceful?='peaceful'?
	//	'population:' population=DOUBLE ('borders:' borders+=[Country]+)? ('washedBy:' washedBy+=[Water]*)*
	//	'}';
	public CountryElements getCountryAccess() {
		return pCountry;
	}
	
	public ParserRule getCountryRule() {
		return getCountryAccess().getRule();
	}
	
	//terminal DOUBLE:
	//	('-' ' '*)? INT ('.' INT)?;
	public TerminalRule getDOUBLERule() {
		return tDOUBLE;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
