package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MapProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMapIn extends ProtoMessage {

	private RESPONSE_MAP_IN.Builder builder;

	public ResponseMapIn(int messageId, int status, String sessionId, ISender sender, RESPONSE_MAP_IN.Builder builder) {
		super(messageId, status, sessionId, sender, null);
		this.builder = builder;
	}

	/**
	 * 
	 * @param	mapInstanceId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMapInstanceId(Integer mapInstanceId) {
		builder.setMapInstanceId(mapInstanceId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMapInstanceId() {
		return builder.getMapInstanceId();
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
		return builder.getEast();
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
		return builder.getSouth();
	}

	/**
	 * 
	 * @param	maxEast
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMaxEast(Integer maxEast) {
		builder.setMaxEast(maxEast);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMaxEast() {
		return builder.getMaxEast();
	}

	/**
	 * 
	 * @param	mapId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMapId(Integer mapId) {
		builder.setMapId(mapId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMapId() {
		return builder.getMapId();
	}

	/**
	 * 
	 * @param	mapName
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMapName(String mapName) {
		builder.setMapName(mapName);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getMapName() {
		return builder.getMapName();
	}

	/**
	 * 
	 * @param	maxSouth
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMaxSouth(Integer maxSouth) {
		builder.setMaxSouth(maxSouth);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getMaxSouth() {
		return builder.getMaxSouth();
	}

	public RESPONSE_MAP_IN getResponseMapIn() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}