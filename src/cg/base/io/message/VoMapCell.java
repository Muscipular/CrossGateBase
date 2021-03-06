package cg.base.io.message;

import cg.base.io.proto.VOProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class VoMapCell {

	private VO_MAP_CELL vo;

	private VO_MAP_CELL.Builder builder;

	public VoMapCell(VO_MAP_CELL vo) {
		this.vo = vo;
	}

	public VoMapCell() {
		builder = VO_MAP_CELL.newBuilder();
	}

	/**
	 * 
	 * @param	east
	 * 			<u>do not has any annotate.</u>
	 */
	public void setEast(Integer east) {
		builder.setEast(east);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getEast() {
		return vo.getEast();
	}

	/**
	 * 
	 * @param	cellMark
	 * 			<u>do not has any annotate.</u>
	 */
	public void setCellMark(Integer cellMark) {
		builder.setCellMark(cellMark);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getCellMark() {
		return vo.getCellMark();
	}

	/**
	 * 
	 * @param	south
	 * 			<u>do not has any annotate.</u>
	 */
	public void setSouth(Integer south) {
		builder.setSouth(south);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getSouth() {
		return vo.getSouth();
	}

	/**
	 * 
	 * @param	mapObjectId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMapObjectId(Integer mapObjectId) {
		builder.setMapObjectId(mapObjectId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMapObjectId() {
		return vo.getMapObjectId();
	}

	/**
	 * 
	 * @param	imageGlobalId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setImageGlobalId(Integer imageGlobalId) {
		builder.setImageGlobalId(imageGlobalId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getImageGlobalId() {
		return vo.getImageGlobalId();
	}

	public VO_MAP_CELL getVO_MAP_CELL() {
		return vo == null ? builder.build() : vo;
	}

}
