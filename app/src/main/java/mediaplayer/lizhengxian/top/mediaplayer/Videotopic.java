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
public class Videotopic {

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

}