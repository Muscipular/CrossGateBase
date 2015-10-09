package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.MapProtos.*;
import cg.base.io.proto.VOProtos.*;
import java.util.List;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseMapMove extends ProtoMessage {

	private RESPONSE_MAP_MOVE.Builder builder;

	public ResponseMapMove(int messageId, int status, String sessionId, ISender sender, RESPONSE_MAP_MOVE.Builder builder) {
		super(messageId, status, sessionId, sender, null);
		this.builder = builder;
	}

	/**
	 * 
	 * @param	mapCells
	 * 			<u>do not has any annotate.</u>
	 */
	public void setMapCells(Iterable<VO_MAP_CELL> mapCells) {
		builder.addAllMapCells(mapCells);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public List<VO_MAP_CELL> getMapCellsList() {
		return builder.getMapCellsList();
	}

	public RESPONSE_MAP_MOVE getResponseMapMove() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}