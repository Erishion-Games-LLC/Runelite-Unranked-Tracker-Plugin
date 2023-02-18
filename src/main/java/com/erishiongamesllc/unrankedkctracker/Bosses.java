package com.erishiongamesllc.unrankedkctracker;

public enum Bosses
{
	SIRE("Abyssal Sire", 45),
	HYDRA("Alchemical Hydra", 45),
	ARTIO("Artio", 999999),
	BARROWS("Barrows Chests", 45),
	BRYO("Bryophyta", 5),
	CALLISTO("Callisto", 45),
	CALVARION("Calvar'ion", 999999),
	CERBERUS("Cerberus", 45),
	COX("Chambers of Xeric", 45),
	COX_CM("Chambers of Xeric Challenge Mode", 5),
	CHAOS_ELE("Chaos Elemental", 45),
	CHAOS_FANATIC("Chaos Fanatic", 45),
	SARA("Commander Zilyana", 45),
	CORPOREAL_BEAST("Corporeal Beast", 45),
	CORRUPTED_GAUNTLET("Corrupted Gauntlet", 5),
	CRAZY_ARCH("Crazy Archaeologist", 45),
	PRIME("Dagannoth Prime", 45),
	REX("Dagannoth Rex", 45),
	SUPREME("Dagannoth Supreme", 45),
	DERANGED_ARCH("Deranged Archaeologist", 45),
	GAUNTLET("Gauntlet", 45),
	BANDOS("General Graardor", 45),
	MOLE("Giant Mole", 45),
	GG("Grotesque Guardians", 45),
	HESPORI("Hespori", 5),
	KQ("Kalphite Queen", 45),
	KBD("King Black Dragon", 45),
	KRAKEN("Kraken", 45),
	ARMA("Kree'arra", 45),
	ZAMMY("K'ril Tsutsaroth", 45),
	MIMIC("Mimic", 1),
	NEX("Nex", 45),
	NIGHTMARE("Nightmare", 45),
	OBOR("Obor", 5),
	MUSPAH("Phantom Muspah", 45),
	PH_NIGHTMARE("Phosani's Nightmare", 45),
	SARACHNIS("Sarachnis", 45),
	SCORPIA("Scorpia", 45),
	SKOTIZO("Skotizo", 5),
	SPINDEL("Spindel", 999999),
	TEMPOROSS("Tempoross", 45),
	TOB("Theatre of Blood", 45),
	TOB_EM("Theatre of Blood Entry Mode", 999999),
	TOB_HM("Theatre of Blood Hard Mode", 45),
	THERMY("Thermonuclear Smoke Devil", 45),
	TOA("Tombs of Amascut", 45),
	TOA_EM("Tombs of Amascut Entry Mode", 999999),
	TOA_HM("Tombs of Amascut Expert Mode", 45),
	ZUK("TzKal-Zuk", 1),
	JAD("TzTok-Jad", 5),
	VENENATIS("Venenatis", 45),
	VETION("Vet'ion", 45),
	VORKATH("Vorkath", 45),
	WINTERTODT("Wintertodt", 45),
	ZALCANO("Zalcano", 45),
	ZULRAH("Zulrah", 45),
	;


	private final String name;
	private final int minimumKC;

	Bosses(String name, int minimumKC)
	{
	this.name = name;
	this.minimumKC = minimumKC;
	}

	public String getName(){
		return this.name;
	}
	public int getMinumiumKC(){
		return this.minimumKC;
	}
}


