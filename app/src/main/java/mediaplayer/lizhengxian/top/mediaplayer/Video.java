/**
  * Copyright 2017 bejson.com 
  */
package mediaplayer.lizhengxian.top.mediaplayer;
import android.os.Parcel;
import android.os.Parcelable;

import com.alibaba.fastjson.annotation.JSONField;
/**
 * Auto-generated: 2017-03-01 17:37:25
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Video implements Parcelable{

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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.cover);
        dest.writeString(this.description);
        dest.writeInt(this.length);
        dest.writeString(this.m3u8Url);
        dest.writeString(this.mp4Url);
        dest.writeInt(this.playcount);
        dest.writeInt(this.playersize);
        dest.writeString(this.prompt);
        dest.writeString(this.ptime);
        dest.writeString(this.replyboard);
        dest.writeInt(this.replycount);
        dest.writeString(this.replyid);
        dest.writeString(this.sectiontitle);
        dest.writeString(this.title);
        dest.writeString(this.topicdesc);
        dest.writeString(this.topicimg);
        dest.writeString(this.topicname);
        dest.writeString(this.topicsid);
        dest.writeString(this.vid);
        dest.writeParcelable(this.videotopic, flags);
        dest.writeString(this.videosource);
    }

    public Video() {
    }

    protected Video(Parcel in) {
        this.cover = in.readString();
        this.description = in.readString();
        this.length = in.readInt();
        this.m3u8Url = in.readString();
        this.mp4Url = in.readString();
        this.playcount = in.readInt();
        this.playersize = in.readInt();
        this.prompt = in.readString();
        this.ptime = in.readString();
        this.replyboard = in.readString();
        this.replycount = in.readInt();
        this.replyid = in.readString();
        this.sectiontitle = in.readString();
        this.title = in.readString();
        this.topicdesc = in.readString();
        this.topicimg = in.readString();
        this.topicname = in.readString();
        this.topicsid = in.readString();
        this.vid = in.readString();
        this.videotopic = in.readParcelable(Videotopic.class.getClassLoader());
        this.videosource = in.readString();
    }

    public static final Creator<Video> CREATOR = new Creator<Video>() {
        @Override
        public Video createFromParcel(Parcel source) {
            return new Video(source);
        }

        @Override
        public Video[] newArray(int size) {
            return new Video[size];
        }
    };
}