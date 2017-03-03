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
public class Videotopic implements Parcelable {

    private String alias;
    private String ename;
    private String tid;
    private String tname;
    @JSONField(name="topic_icons")
    private String topicIcons;
    public void setAlias(String alias) {
         this.alias = alias;
     }
     public String getAlias() {
         return alias;
     }

    public void setEname(String ename) {
         this.ename = ename;
     }
     public String getEname() {
         return ename;
     }

    public void setTid(String tid) {
         this.tid = tid;
     }
     public String getTid() {
         return tid;
     }

    public void setTname(String tname) {
         this.tname = tname;
     }
     public String getTname() {
         return tname;
     }

    public void setTopicIcons(String topicIcons) {
         this.topicIcons = topicIcons;
     }
     public String getTopicIcons() {
         return topicIcons;
     }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.alias);
        dest.writeString(this.ename);
        dest.writeString(this.tid);
        dest.writeString(this.tname);
        dest.writeString(this.topicIcons);
    }

    public Videotopic() {
    }

    protected Videotopic(Parcel in) {
        this.alias = in.readString();
        this.ename = in.readString();
        this.tid = in.readString();
        this.tname = in.readString();
        this.topicIcons = in.readString();
    }

    public static final Parcelable.Creator<Videotopic> CREATOR = new Parcelable.Creator<Videotopic>() {
        @Override
        public Videotopic createFromParcel(Parcel source) {
            return new Videotopic(source);
        }

        @Override
        public Videotopic[] newArray(int size) {
            return new Videotopic[size];
        }
    };
}