package cg.base.io.message;

import net.io.ISender;
import net.message.ByteArrayMessage;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class RequestServerList extends ByteArrayMessage {

	public RequestServerList(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_REQUEST_SERVER_LIST_VALUE, status, sessionId, sender, datas);
	}

	public RequestServerList() {
		super();
		messageId = MessageId.MI_REQUEST_SERVER_LIST_VALUE;
	}

}
