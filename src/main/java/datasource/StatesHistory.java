package datasource;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


//GET API call https://api.covid19india.org/states_daily.json
public class StatesHistory {

    @SerializedName("an")
    @Expose
    private String an;
    @SerializedName("ap")
    @Expose
    private String ap;
    @SerializedName("ar")
    @Expose
    private String ar;
    @SerializedName("as")
    @Expose
    private String as;
    @SerializedName("br")
    @Expose
    private String br;
    @SerializedName("ch")
    @Expose
    private String ch;
    @SerializedName("ct")
    @Expose
    private String ct;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("dd")
    @Expose
    private String dd;
    @SerializedName("dl")
    @Expose
    private String dl;
    @SerializedName("dn")
    @Expose
    private String dn;
    @SerializedName("ga")
    @Expose
    private String ga;
    @SerializedName("gj")
    @Expose
    private String gj;
    @SerializedName("hp")
    @Expose
    private String hp;
    @SerializedName("hr")
    @Expose
    private String hr;
    @SerializedName("jh")
    @Expose
    private String jh;
    @SerializedName("jk")
    @Expose
    private String jk;
    @SerializedName("ka")
    @Expose
    private String ka;
    @SerializedName("kl")
    @Expose
    private String kl;
    @SerializedName("la")
    @Expose
    private String la;
    @SerializedName("ld")
    @Expose
    private String ld;
    @SerializedName("mh")
    @Expose
    private String mh;
    @SerializedName("ml")
    @Expose
    private String ml;
    @SerializedName("mn")
    @Expose
    private String mn;
    @SerializedName("mp")
    @Expose
    private String mp;
    @SerializedName("mz")
    @Expose
    private String mz;
    @SerializedName("nl")
    @Expose
    private String nl;
    @SerializedName("or")
    @Expose
    private String or;
    @SerializedName("pb")
    @Expose
    private String pb;
    @SerializedName("py")
    @Expose
    private String py;
    @SerializedName("rj")
    @Expose
    private String rj;
    @SerializedName("sk")
    @Expose
    private String sk;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("tg")
    @Expose
    private String tg;
    @SerializedName("tn")
    @Expose
    private String tn;
    @SerializedName("tr")
    @Expose
    private String tr;
    @SerializedName("tt")
    @Expose
    private String tt;
    @SerializedName("up")
    @Expose
    private String up;
    @SerializedName("ut")
    @Expose
    private String ut;
    @SerializedName("wb")
    @Expose
    private String wb;

    /**
     * No args constructor for use in serialization
     *
     */
    public StatesHistory() {
    }

    /**
     *
     * @param date
     * @param dd
     * @param tt
     * @param jk
     * @param dl
     * @param hp
     * @param py
     * @param dn
     * @param hr
     * @param wb
     * @param br
     * @param ka
     * @param sk
     * @param ga
     * @param mh
     * @param up
     * @param ml
     * @param ut
     * @param kl
     * @param mn
     * @param gj
     * @param mp
     * @param or
     * @param ch
     * @param an
     * @param mz
     * @param ap
     * @param ar
     * @param ct
     * @param as
     * @param pb
     * @param tg
     * @param la
     * @param ld
     * @param rj
     * @param tn
     * @param jh
     * @param nl
     * @param tr
     * @param status
     */
    public StatesHistory(String an, String ap, String ar, String as, String br, String ch, String ct, String date, String dd, String dl, String dn, String ga, String gj, String hp, String hr, String jh, String jk, String ka, String kl, String la, String ld, String mh, String ml, String mn, String mp, String mz, String nl, String or, String pb, String py, String rj, String sk, String status, String tg, String tn, String tr, String tt, String up, String ut, String wb) {
        super();
        this.an = an;
        this.ap = ap;
        this.ar = ar;
        this.as = as;
        this.br = br;
        this.ch = ch;
        this.ct = ct;
        this.date = date;
        this.dd = dd;
        this.dl = dl;
        this.dn = dn;
        this.ga = ga;
        this.gj = gj;
        this.hp = hp;
        this.hr = hr;
        this.jh = jh;
        this.jk = jk;
        this.ka = ka;
        this.kl = kl;
        this.la = la;
        this.ld = ld;
        this.mh = mh;
        this.ml = ml;
        this.mn = mn;
        this.mp = mp;
        this.mz = mz;
        this.nl = nl;
        this.or = or;
        this.pb = pb;
        this.py = py;
        this.rj = rj;
        this.sk = sk;
        this.status = status;
        this.tg = tg;
        this.tn = tn;
        this.tr = tr;
        this.tt = tt;
        this.up = up;
        this.ut = ut;
        this.wb = wb;
    }

    public String getAn() {
        return an;
    }

    public void setAn(String an) {
        this.an = an;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    public String getBr() {
        return br;
    }

    public void setBr(String br) {
        this.br = br;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    public String getDl() {
        return dl;
    }

    public void setDl(String dl) {
        this.dl = dl;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getGa() {
        return ga;
    }

    public void setGa(String ga) {
        this.ga = ga;
    }

    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    public String getJh() {
        return jh;
    }

    public void setJh(String jh) {
        this.jh = jh;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getKa() {
        return ka;
    }

    public void setKa(String ka) {
        this.ka = ka;
    }

    public String getKl() {
        return kl;
    }

    public void setKl(String kl) {
        this.kl = kl;
    }

    public String getLa() {
        return la;
    }

    public void setLa(String la) {
        this.la = la;
    }

    public String getLd() {
        return ld;
    }

    public void setLd(String ld) {
        this.ld = ld;
    }

    public String getMh() {
        return mh;
    }

    public void setMh(String mh) {
        this.mh = mh;
    }

    public String getMl() {
        return ml;
    }

    public void setMl(String ml) {
        this.ml = ml;
    }

    public String getMn() {
        return mn;
    }

    public void setMn(String mn) {
        this.mn = mn;
    }

    public String getMp() {
        return mp;
    }

    public void setMp(String mp) {
        this.mp = mp;
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public String getOr() {
        return or;
    }

    public void setOr(String or) {
        this.or = or;
    }

    public String getPb() {
        return pb;
    }

    public void setPb(String pb) {
        this.pb = pb;
    }

    public String getPy() {
        return py;
    }

    public void setPy(String py) {
        this.py = py;
    }

    public String getRj() {
        return rj;
    }

    public void setRj(String rj) {
        this.rj = rj;
    }

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }

    public String getTn() {
        return tn;
    }

    public void setTn(String tn) {
        this.tn = tn;
    }

    public String getTr() {
        return tr;
    }

    public void setTr(String tr) {
        this.tr = tr;
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public String getUt() {
        return ut;
    }

    public void setUt(String ut) {
        this.ut = ut;
    }

    public String getWb() {
        return wb;
    }

    public void setWb(String wb) {
        this.wb = wb;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("an", an).append("ap", ap).append("ar", ar).append("as", as).append("br", br).append("ch", ch).append("ct", ct).append("date", date).append("dd", dd).append("dl", dl).append("dn", dn).append("ga", ga).append("gj", gj).append("hp", hp).append("hr", hr).append("jh", jh).append("jk", jk).append("ka", ka).append("kl", kl).append("la", la).append("ld", ld).append("mh", mh).append("ml", ml).append("mn", mn).append("mp", mp).append("mz", mz).append("nl", nl).append("or", or).append("pb", pb).append("py", py).append("rj", rj).append("sk", sk).append("status", status).append("tg", tg).append("tn", tn).append("tr", tr).append("tt", tt).append("up", up).append("ut", ut).append("wb", wb).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(date).append(dd).append(tt).append(jk).append(dl).append(hp).append(py).append(dn).append(hr).append(wb).append(br).append(ka).append(sk).append(ga).append(mh).append(up).append(ml).append(ut).append(kl).append(mn).append(gj).append(mp).append(or).append(ch).append(an).append(mz).append(ap).append(ar).append(ct).append(as).append(pb).append(tg).append(la).append(ld).append(rj).append(tn).append(jh).append(nl).append(tr).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatesHistory) == false) {
            return false;
        }
        StatesHistory rhs = ((StatesHistory) other);
        return new EqualsBuilder().append(date, rhs.date).append(dd, rhs.dd).append(tt, rhs.tt).append(jk, rhs.jk).append(dl, rhs.dl).append(hp, rhs.hp).append(py, rhs.py).append(dn, rhs.dn).append(hr, rhs.hr).append(wb, rhs.wb).append(br, rhs.br).append(ka, rhs.ka).append(sk, rhs.sk).append(ga, rhs.ga).append(mh, rhs.mh).append(up, rhs.up).append(ml, rhs.ml).append(ut, rhs.ut).append(kl, rhs.kl).append(mn, rhs.mn).append(gj, rhs.gj).append(mp, rhs.mp).append(or, rhs.or).append(ch, rhs.ch).append(an, rhs.an).append(mz, rhs.mz).append(ap, rhs.ap).append(ar, rhs.ar).append(ct, rhs.ct).append(as, rhs.as).append(pb, rhs.pb).append(tg, rhs.tg).append(la, rhs.la).append(ld, rhs.ld).append(rj, rhs.rj).append(tn, rhs.tn).append(jh, rhs.jh).append(nl, rhs.nl).append(tr, rhs.tr).append(status, rhs.status).isEquals();
    }

}