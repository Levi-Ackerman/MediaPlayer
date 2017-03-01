/**
  * Copyright 2017 bejson.com 
  */
package mediaplayer.lizhengxian.top.mediaplayer;
import com.alibaba.fastjson.annotation.JSONField;
/**
 * Auto-generated: 2017-03-01 17:37:25
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Video {

    private String cover;
    private String description;
    private int length;
    @JSONField(name = "m3u8_url")
    private String m3u8Url;
    @JSONField(name = "mp4_url")
    private String mp4Url;
    @JSONField(name = "playCount")
    private int playcount;
    private int playersize;
    private String prompt;
    private String ptime;
    @JSONField(name = "replyBoard")
    private String replyboard;
    @JSONField(name = "replyCount")
    private int replycount;
    private String replyid;
    private String sectiontitle;
    private String title;
    @JSONField(name = "topicDesc")
    private String topicdesc;
    @JSONField(name = "topicImg")
    private String topicimg;
    @JSONField(name = "topicName")
    private String topicname;
    @JSONField(name = "topicSid")
    private String topicsid;
    private String vid;
    @JSONField(name = "videoTopic")
    private Videotopic videotopic;
    private String videosource;
    public void setCover(String cover) {
         this.cover = cover;
     }
     public String getCover() {
         return cover;
     }

    public void setDescription(String description) {
         this.description = description;
     }
     public String getDescription() {
         return description;
     }

    public void setLength(int length) {
         this.length = length;
     }
     public int getLength() {
         return length;
     }

    public void setM3u8Url(String m3u8Url) {
         this.m3u8Url = m3u8Url;
     }
     public String getM3u8Url() {
         return m3u8Url;
     }

    public void setMp4Url(String mp4Url) {
         this.mp4Url = mp4Url;
     }
     public String getMp4Url() {
         return mp4Url;
     }

    public void setPlaycount(int playcount) {
         this.playcount = playcount;
     }
     public int getPlaycount() {
         return playcount;
     }

    public void setPlayersize(int playersize) {
         this.playersize = playersize;
     }
     public int getPlayersize() {
         return playersize;
     }

    public void setPrompt(String prompt) {
         this.prompt = prompt;
     }
     public String getPrompt() {
         return prompt;
     }

    public void setPtime(String ptime) {
         this.ptime = ptime;
     }
     public String getPtime() {
         return ptime;
     }

    public void setReplyboard(String replyboard) {
         this.replyboard = replyboard;
     }
     public String getReplyboard() {
         return replyboard;
     }

    public void setReplycount(int replycount) {
         this.replycount = replycount;
     }
     public int getReplycount() {
         return replycount;
     }

    public void setReplyid(String replyid) {
         this.replyid = replyid;
     }
     public String getReplyid() {
         return replyid;
     }

    public void setSectiontitle(String sectiontitle) {
         this.sectiontitle = sectiontitle;
     }
     public String getSectiontitle() {
         return sectiontitle;
     }

    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setTopicdesc(String topicdesc) {
         this.topicdesc = topicdesc;
     }
     public String getTopicdesc() {
         return topicdesc;
     }

    public void setTopicimg(String topicimg) {
         this.topicimg = topicimg;
     }
     public String getTopicimg() {
         return topicimg;
     }

    public void setTopicname(String topicname) {
         this.topicname = topicname;
     }
     public String getTopicname() {
         return topicname;
     }

    public void setTopicsid(String topicsid) {
         this.topicsid = topicsid;
     }
     public String getTopicsid() {
         return topicsid;
     }

    public void setVid(String vid) {
         this.vid = vid;
     }
     public String getVid() {
         return vid;
     }

    public void setVideotopic(Videotopic videotopic) {
         this.videotopic = videotopic;
     }
     public Videotopic getVideotopic() {
         return videotopic;
     }

    public void setVideosource(String videosource) {
         this.videosource = videosource;
     }
     public String getVideosource() {
         return videosource;
     }

}