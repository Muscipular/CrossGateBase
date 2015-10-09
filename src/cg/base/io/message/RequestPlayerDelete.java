package cg.base.io.message;

import net.dipatch.ISender;
import net.io.protocal.proto.ProtoMessage;
import cg.base.io.proto.PlayerProtos.*;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestPlayerDelete extends ProtoMessage {

	private REQUEST_PLAYER_DELETE.Builder builder;

	public RequestPlayerDelete(int messageId, int status, String sessionId, ISender sender, REQUEST_PLAYER_DELETE.Builder builder) {
		super(messageId, status, sessionId, sender, null);
		this.builder = builder;
	}

	/**
	 * 
	 * @param	roleId
	 * 			<u>do not has any annotate.</u>
	 */
	public void setRoleId(Integer roleId) {
		builder.setRoleId(roleId);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getRoleId() {
		return builder.getRoleId();
	}

	public REQUEST_PLAYER_DELETE getRequestPlayerDelete() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}