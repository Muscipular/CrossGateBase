package cg.base.io.message;

import net.io.ISender;
import net.message.ByteArrayMessage;
import cg.base.io.proto.ChatProtos.*;
import cg.base.io.proto.MessageIdProto.MessageId;

/**
 * This is a auto make java file, so do not modify me.
 * @author fuhuiyuan
 */
public class ResponseChatJoin extends ByteArrayMessage {

	private RESPONSE_CHAT_JOIN.Builder builder;

	public ResponseChatJoin(int status, String sessionId, ISender sender, byte[] datas) throws Exception {
		super(MessageId.MI_RESPONSE_CHAT_JOIN_VALUE, status, sessionId, sender, datas);
		builder = RESPONSE_CHAT_JOIN.newBuilder();
		if (datas != null) {
			builder.mergeFrom(datas);
		}
	}

	public ResponseChatJoin() {
		super();
		builder = RESPONSE_CHAT_JOIN.newBuilder();
		messageId = MessageId.MI_RESPONSE_CHAT_JOIN_VALUE;
	}

	/**
	 * 
	 * @param	channel
	 * 			<u>do not has any annotate.</u>
	 */
	public void setChannel(Integer channel) {
		builder.setChannel(channel);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public int getChannel() {
		return builder.getChannel();
	}

	/**
	 * 
	 * @param	channelName
	 * 			<u>do not has any annotate.</u>
	 */
	public void setChannelName(String channelName) {
		builder.setChannelName(channelName);
	}

	/**
	 * 
	 * @return	<u>do not has any annotate.</u>
	 */
	public String getChannelName() {
		return builder.getChannelName();
	}

	public RESPONSE_CHAT_JOIN getResponseChatJoin() {
		return builder.build();
	}

	@Override
	public byte[] getByteArray() {
		return builder.build().toByteArray();
	}

}
