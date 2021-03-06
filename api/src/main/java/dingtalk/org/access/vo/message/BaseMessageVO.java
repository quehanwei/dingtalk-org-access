package dingtalk.org.access.vo.message;

/**
 * @author zhaoting.yht
 * @since 17/2/13 下午5:37
 */
public class BaseMessageVO {

    private String msgtype;

    /**
     * 企业会话消息的参数
     */
    private String agentid;
    private String touser;
    private String toparty;
    private String code;

    /**
     * 普通会话消息的参数
     */
    private String sender;
    private String cid;

    /**
     * 群会话消息的参数
     */
    private String chatid;

    /**
     * 服务窗会话消息的参数
     */
    private String channelAgentId;

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getToparty() {
        return toparty;
    }

    public void setToparty(String toparty) {
        this.toparty = toparty;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getChatid() {
        return chatid;
    }

    public void setChatid(String chatid) {
        this.chatid = chatid;
    }

    public String getChannelAgentId() {
        return channelAgentId;
    }

    public void setChannelAgentId(String channelAgentId) {
        this.channelAgentId = channelAgentId;
    }
}
