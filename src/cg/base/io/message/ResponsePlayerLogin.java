package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.PlayerProtos.*;
import cg.base.io.proto.VOProtos.*;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponsePlayerLogin extends ProtoMessage {

	private RESPONSE_PLAYER_LOGIN.Builder builder;

	public ResponsePlayerLogin(int messageId, int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(messageId, status, sessionId, sender, datas);
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponsePlayerLogin() {
		super();
	}

	/**
	 * 
	 * @param	baseInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBaseInfo(VoUnitBaseInfo baseInfo) {
		builder.setBaseInfo(baseInfo.getVO_UNIT_BASE_INFO());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_UNIT_BASE_INFO getBaseInfo() {
		return builder.getBaseInfo();
	}

	/**
	 * 
	 * @param	skillSet
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSkillSet(VoSkillSet skillSet) {
		builder.setSkillSet(skillSet.getVO_SKILL_SET());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_SKILL_SET getSkillSet() {
		return builder.getSkillSet();
	}

	/**
	 * 
	 * @param	bags
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBags(Iterable<VoBag> bags) {
		List<VO_BAG> list = Lists.newLinkedList();
		for (VoBag vo : bags) {
			list.add(vo.getVO_BAG());
		}
		builder.addAllBags(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_BAG> getBagsList() {
		return builder.getBagsList();
	}

	/**
	 * 
	 * @param	titles
	 * 			<u>do not has any annotate.</u>
	 */
	public void setTitles(Iterable<VoTitle> titles) {
		List<VO_TITLE> list = Lists.newLinkedList();
		for (VoTitle vo : titles) {
			list.add(vo.getVO_TITLE());
		}
		builder.addAllTitles(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_TITLE> getTitlesList() {
		return builder.getTitlesList();
	}

	/**
	 * 
	 * @param	extendInfo
	 * 			<u>do not has any annotate.</u>
	 */
	public void setExtendInfo(VoUnitExtendInfo extendInfo) {
		builder.setExtendInfo(extendInfo.getVO_UNIT_EXTEND_INFO());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_UNIT_EXTEND_INFO getExtendInfo() {
		return builder.getExtendInfo();
	}

	/**
	 * 
	 * @param	headTitle
	 * 			<u>do not has any annotate.</u>
	 */
	public void setHeadTitle(VoTitles headTitle) {
		builder.setHeadTitle(headTitle.getVO_TITLES());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_TITLES getHeadTitle() {
		return builder.getHeadTitle();
	}

	/**
	 * 
	 * @param	money
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMoney(Integer money) {
		builder.setMoney(money);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMoney() {
		return builder.getMoney();
	}

	/**
	 * 
	 * @param	elements
	 * 			<u>do not has any annotate.</u>
	 */
	public void setElements(Iterable<Integer> elements) {
		builder.addAllElements(elements);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<Integer> getElementsList() {
		return builder.getElementsList();
	}

	/**
	 * 
	 * @param	options
	 * 			<u>do not has any annotate.</u>
	 */
	public void setOptions(Iterable<VoOption> options) {
		List<VO_OPTION> list = Lists.newLinkedList();
		for (VoOption vo : options) {
			list.add(vo.getVO_OPTION());
		}
		builder.addAllOptions(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_OPTION> getOptionsList() {
		return builder.getOptionsList();
	}

	/**
	 * 
	 * @param	attributes
	 * 			<u>do not has any annotate.</u>
	 */
	public void setAttributes(Iterable<VoAttributes> attributes) {
		List<VO_ATTRIBUTES> list = Lists.newLinkedList();
		for (VoAttributes vo : attributes) {
			list.add(vo.getVO_ATTRIBUTES());
		}
		builder.addAllAttributes(list);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_ATTRIBUTES> getAttributesList() {
		return builder.getAttributesList();
	}

	/**
	 * 
	 * @param	position
	 * 			<u>do not has any annotate.</u>
	 */
	public void setPosition(VoPosition position) {
		builder.setPosition(position.getVO_POSITION());
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public VO_POSITION getPosition() {
		return builder.getPosition();
	}

	/**
	 * 
	 * @param	battleLocal
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBattleLocal(Boolean battleLocal) {
		builder.setBattleLocal(battleLocal);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public Boolean getBattleLocal() {
		return builder.getBattleLocal();
	}

	/**
	 * 
	 * @param	job
	 * 			<u>do not has any annotate.</u>
	 */
	public void setJob(String job) {
		builder.setJob(job);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getJob() {
		return builder.getJob();
	}

	/**
	 * 
	 * @param	battleScore
	 * 			<u>do not has any annotate.</u>
	 */
	public void setBattleScore(Integer battleScore) {
		builder.setBattleScore(battleScore);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getBattleScore() {
		return builder.getBattleScore();
	}

	public RESPONSE_PLAYER_LOGIN getResponsePlayerLogin() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
