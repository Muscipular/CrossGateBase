package cg.base.skill;

import java.util.Map;

import cg.base.sprite.AttributeCell;

public interface SkillTemplate {
	
	/**
	 * ������
	 */
	byte TYPE_ASSIST = 0;
	/**
	 * ������
	 */
	byte TYPE_ATTACK = 1;
	/**
	 * ������
	 */
	byte TYPE_PRODUCE = 2;
	/**
	 * ħ����
	 */
	byte TYPE_MAGIC = 3;
	/**
	 * �����
	 */
	byte TYPE_RIDE = 4;
	
	String getName();
	
	short getId();
	
	String getDescription();
	
	byte getType();
	
	short getStudyPrice();
	
	short getNeedWeaponType();
	
	byte getUseSpace();
	
	byte getExpType();
	
	boolean getNotGainExp();
	
	short getDoubleExpType();
	
	Map<String, AttributeCell> getAttributes();
	
	byte getEffectWorkLevel();
	
	short getPriceRate();

}
