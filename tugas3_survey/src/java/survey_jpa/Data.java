/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survey_jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fadhli Hisyam
 */
@Entity
@Table(name = "data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data.findAll", query = "SELECT d FROM Data d")
    , @NamedQuery(name = "Data.findByDataId", query = "SELECT d FROM Data d WHERE d.dataId = :dataId")
    , @NamedQuery(name = "Data.findByNama", query = "SELECT d FROM Data d WHERE d.nama = :nama")
    , @NamedQuery(name = "Data.findByNim", query = "SELECT d FROM Data d WHERE d.nim = :nim")
    , @NamedQuery(name = "Data.findByAngkatan", query = "SELECT d FROM Data d WHERE d.angkatan = :angkatan")
    , @NamedQuery(name = "Data.findByMatkulSuka", query = "SELECT d FROM Data d WHERE d.matkulSuka = :matkulSuka")
    , @NamedQuery(name = "Data.findByMatkulTaksuka", query = "SELECT d FROM Data d WHERE d.matkulTaksuka = :matkulTaksuka")
    , @NamedQuery(name = "Data.findByPraktikumSuka", query = "SELECT d FROM Data d WHERE d.praktikumSuka = :praktikumSuka")
    , @NamedQuery(name = "Data.findByPraktikumTidaksuka", query = "SELECT d FROM Data d WHERE d.praktikumTidaksuka = :praktikumTidaksuka")
    , @NamedQuery(name = "Data.findByKonsentrasi", query = "SELECT d FROM Data d WHERE d.konsentrasi = :konsentrasi")})
public class Data implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "data_id")
    private Integer dataId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "nim")
    private String nim;
    @Size(max = 4)
    @Column(name = "angkatan")
    private String angkatan;
    @Size(max = 50)
    @Column(name = "matkul_suka")
    private String matkulSuka;
    @Size(max = 50)
    @Column(name = "matkul_taksuka")
    private String matkulTaksuka;
    @Size(max = 50)
    @Column(name = "praktikum_suka")
    private String praktikumSuka;
    @Size(max = 50)
    @Column(name = "praktikum_tidaksuka")
    private String praktikumTidaksuka;
    @Size(max = 50)
    @Column(name = "konsentrasi")
    private String konsentrasi;

    public Data() {
    }

    public Data(Integer dataId) {
        this.dataId = dataId;
    }

    public Data(Integer dataId, String nama, String nim) {
        this.dataId = dataId;
        this.nama = nama;
        this.nim = nim;
    }

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public String getMatkulSuka() {
        return matkulSuka;
    }

    public void setMatkulSuka(String matkulSuka) {
        this.matkulSuka = matkulSuka;
    }

    public String getMatkulTaksuka() {
        return matkulTaksuka;
    }

    public void setMatkulTaksuka(String matkulTaksuka) {
        this.matkulTaksuka = matkulTaksuka;
    }

    public String getPraktikumSuka() {
        return praktikumSuka;
    }

    public void setPraktikumSuka(String praktikumSuka) {
        this.praktikumSuka = praktikumSuka;
    }

    public String getPraktikumTidaksuka() {
        return praktikumTidaksuka;
    }

    public void setPraktikumTidaksuka(String praktikumTidaksuka) {
        this.praktikumTidaksuka = praktikumTidaksuka;
    }

    public String getKonsentrasi() {
        return konsentrasi;
    }

    public void setKonsentrasi(String konsentrasi) {
        this.konsentrasi = konsentrasi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataId != null ? dataId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data)) {
            return false;
        }
        Data other = (Data) object;
        if ((this.dataId == null && other.dataId != null) || (this.dataId != null && !this.dataId.equals(other.dataId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "survey_jpa.Data[ dataId=" + dataId + " ]";
    }
    
}
