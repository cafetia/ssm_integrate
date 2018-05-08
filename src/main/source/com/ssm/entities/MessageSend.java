package com.ssm.entities;

import java.sql.Date;

public class MessageSend {
    private int  id;
    private int MSGLEVEL;
    private String SERVICEID ;
    private int MSGFORMAT;
    private String VALIDTIME;
    private String ATTIME;
    private String CHARGETERMID;
    private String DESTTERMID ;
    private String REPLYPATH;
    private String MSGCONTENT;
    private int FLAG ;
    private Date CREATE_DATE  ;
    private String DESTTERMIDFILE ;
    private Date SEND_DATE  ;
    private int OPERATE_ID ;
    private int SEND_CNT  ;
    private int DEAL_FLAG  ;
    private Date DEAL_DATE  ;
    private String AREA_CODE ;
    private int OLD_ID ;
    private int LATN_ID ;

    public int getId() {
        return id;
    }

    public void setId(int ID) {
        this.id = id;
    }

    public int getMSGLEVEL() {
        return MSGLEVEL;
    }

    public void setMSGLEVEL(int MSGLEVEL) {
        this.MSGLEVEL = MSGLEVEL;
    }

    public String getSERVICEID() {
        return SERVICEID;
    }

    public void setSERVICEID(String SERVICEID) {
        this.SERVICEID = SERVICEID;
    }

    public int getMSGFORMAT() {
        return MSGFORMAT;
    }

    public void setMSGFORMAT(int MSGFORMAT) {
        this.MSGFORMAT = MSGFORMAT;
    }

    public String getVALIDTIME() {
        return VALIDTIME;
    }

    public void setVALIDTIME(String VALIDTIME) {
        this.VALIDTIME = VALIDTIME;
    }

    public String getATTIME() {
        return ATTIME;
    }

    public void setATTIME(String ATTIME) {
        this.ATTIME = ATTIME;
    }

    public String getCHARGETERMID() {
        return CHARGETERMID;
    }

    public void setCHARGETERMID(String CHARGETERMID) {
        this.CHARGETERMID = CHARGETERMID;
    }

    public String getDESTTERMID() {
        return DESTTERMID;
    }

    public void setDESTTERMID(String DESTTERMID) {
        this.DESTTERMID = DESTTERMID;
    }

    public String getREPLYPATH() {
        return REPLYPATH;
    }

    public void setREPLYPATH(String REPLYPATH) {
        this.REPLYPATH = REPLYPATH;
    }

    public String getMSGCONTENT() {
        return MSGCONTENT;
    }

    public void setMSGCONTENT(String MSGCONTENT) {
        this.MSGCONTENT = MSGCONTENT;
    }

    public int getFLAG() {
        return FLAG;
    }

    public void setFLAG(int FLAG) {
        this.FLAG = FLAG;
    }

    public Date getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(Date CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public String getDESTTERMIDFILE() {
        return DESTTERMIDFILE;
    }

    public void setDESTTERMIDFILE(String DESTTERMIDFILE) {
        this.DESTTERMIDFILE = DESTTERMIDFILE;
    }

    public Date getSEND_DATE() {
        return SEND_DATE;
    }

    public void setSEND_DATE(Date SEND_DATE) {
        this.SEND_DATE = SEND_DATE;
    }

    public int getOPERATE_ID() {
        return OPERATE_ID;
    }

    public void setOPERATE_ID(int OPERATE_ID) {
        this.OPERATE_ID = OPERATE_ID;
    }

    public int getSEND_CNT() {
        return SEND_CNT;
    }

    public void setSEND_CNT(int SEND_CNT) {
        this.SEND_CNT = SEND_CNT;
    }

    public int getDEAL_FLAG() {
        return DEAL_FLAG;
    }

    public void setDEAL_FLAG(int DEAL_FLAG) {
        this.DEAL_FLAG = DEAL_FLAG;
    }

    public Date getDEAL_DATE() {
        return DEAL_DATE;
    }

    public void setDEAL_DATE(Date DEAL_DATE) {
        this.DEAL_DATE = DEAL_DATE;
    }

    public String getAREA_CODE() {
        return AREA_CODE;
    }

    public void setAREA_CODE(String AREA_CODE) {
        this.AREA_CODE = AREA_CODE;
    }

    public int getOLD_ID() {
        return OLD_ID;
    }

    public void setOLD_ID(int OLD_ID) {
        this.OLD_ID = OLD_ID;
    }

    public int getLATN_ID() {
        return LATN_ID;
    }

    public void setLATN_ID(int LATN_ID) {
        this.LATN_ID = LATN_ID;
    }
}
