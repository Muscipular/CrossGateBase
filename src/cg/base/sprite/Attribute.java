package cg.base.sprite;

public interface Attribute {
	
	String ATTRIBUTE_TYPE_BP = "ATTRIBUTE_BP";
	
	String ATTRIBUTE_TYPE_BASE = "ATTRIBUTE";
	
	String ATTRIBUTE_TYPE_EXTEND = "ATTRIBUTE_EXTEND";
	
	String ATTRIBUTE_TYPE_WORK = "ATTRIBUTE_WORK";
	
	String ATTRIBUTE_TYPE_RESIST = "ATTRIBUTE_RESIST";
	
	byte BP_VITALITY = 0; // VTL --����
	
	byte BP_STRENGTH = 1; // STR --����
	
	byte BP_TOUGH = 2; // TGH --ǿ��
	
	byte BP_QUICK = 3; // QUI --�ٶ�
	
	byte BP_MAGIC = 4; // MGC --ħ��
	
	byte BP_REMAIND = 5; // ʣ��
	
	byte ATTRIBUTE_HP_MAX = 0; // ���Ѫ��
	
	byte ATTRIBUTE_MP_MAX = 1; // ���ħ��
	
	byte ATTRIBUTE_ATTACK = 2; // ATK --����
	
	byte ATTRIBUTE_DEFEND = 3; // DEF --����
	
	byte ATTRIBUTE_AGILITY = 4; // AGL --����
	
	byte ATTRIBUTE_HP = 5; // ��ǰѪ��
	
	byte ATTRIBUTE_MP = 6; // ��ǰ���ħ��
	
	byte ATTRIBUTE_INJURED = 7; // ����
	
	byte ATTRIBUTE_SOUL = 8; // ��������
	
	byte ATTRIBUTE_EXTEND_CRITICAL = 0; // CRI --��ɱ
	
	byte ATTRIBUTE_EXTEND_HIT = 1; // HIT --����
	
	byte ATTRIBUTE_EXTEND_COUNTER = 2; // CTR --����
	
	byte ATTRIBUTE_EXTEND_AVOID = 3; // AVD --����
	
	byte ATTRIBUTE_EXTEND_RECOVER = 4; // RCV --�ظ�
	
	byte ATTRIBUTE_EXTEND_MIND = 5; // MND --����
	
	byte ATTRIBUTE_WORK_STAMINA = 0; // STM --����
	
	byte ATTRIBUTE_WORK_DEXTERITY = 1; // DEX --���� 
	
	byte ATTRIBUTE_WORK_INTELLIGENCE = 2; // INT --����
	
	byte ATTRIBUTE_WORK_CHARM = 3; // CHM --����
	
	byte ATTRIBUTE_RESIST_POISON = 0; // POI --����
	
	byte ATTRIBUTE_RESIST_INTOXICATION = 1; // ITX --����
	
	byte ATTRIBUTE_RESIST_SLEEP = 2; // SLP --����˯
	
	byte ATTRIBUTE_RESIST_CONFUSION = 3; // CNF --������
	
	byte ATTRIBUTE_RESIST_STONE = 4; // STN --��ʯ��
	
	byte ATTRIBUTE_RESIST_AMNESIA = 5; // AMN --������
	
	byte ATTRIBUTE_RESIST_MAGIC = 6; // RSS--��ħ
	
	double addAttributeValue(String attributeType, byte type, double value);
	
	void setAttributeValue(String attributeType, byte type, double value);
	
	double getAttributeValue(String attributeType, byte type);

}
