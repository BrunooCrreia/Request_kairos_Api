package entities;

import com.google.gson.annotations.SerializedName;

import entities.service.ScannerInterface;

public class SavePerson implements ScannerInterface {

	@SerializedName("cracha")
	private Integer cracha;

	@SerializedName("matricula")
	private Integer matricula;

	@SerializedName("id")
	private Integer id;

	@SerializedName("name")
	private String name;

	@SerializedName("cpf")
	private Integer cpf;

	@SerializedName("dataAdmissao")
	private String dataAdmissao;

	@SerializedName("idEstrutura")
	private Integer idEstrutura;

	@SerializedName("tipoDoFuncionario")
	private Integer tipoDoFuncionario;

	@SerializedName("tipoSalario")
	private Integer tipoSalario;

	@SerializedName("idHorario")
	private Integer idHorario;

	@SerializedName("maisDeUmVinculoEmpregaticio")
	private Integer maisDeUmVinculoEmpregaticio;

	@SerializedName("idRegraDeCalculo")
	private Integer idRegraDeCalculo;

	@SerializedName("codigoPis")
	private int codigoPis;

	public SavePerson(Integer cracha, Integer matricula, Integer id, String name, Integer cpf, String dataAdmissao,
			Integer idEstrutura, Integer tipoDoFuncionario, Integer tipoSalario, Integer idSalario, Integer idHorario,
			Integer maisDeUmVinculoEmpregaticio, Integer idRegraDeCalculo, Integer codigoPis) {
		this.cracha = cracha;
		this.matricula = matricula;
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.dataAdmissao = dataAdmissao;
		this.idEstrutura = idEstrutura;
		this.tipoDoFuncionario = tipoDoFuncionario;
		this.tipoSalario = tipoSalario;
		this.idHorario = idHorario;
		this.maisDeUmVinculoEmpregaticio = maisDeUmVinculoEmpregaticio;
		this.idRegraDeCalculo = idRegraDeCalculo;
		this.codigoPis = codigoPis;
	}

	public SavePerson() {
		
	}

	public Integer getCracha() {
		return cracha;
	}

	public void setCracha(Integer cracha) {
		this.cracha = cracha;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Integer getIdEstrutura() {
		return idEstrutura;
	}

	public void setIdEstrutura(Integer idEstrutura) {
		this.idEstrutura = idEstrutura;
	}

	public Integer getTipoDoFuncionario() {
		return tipoDoFuncionario;
	}

	public void setTipoDoFuncionario(Integer tipoDoFuncionario) {
		this.tipoDoFuncionario = tipoDoFuncionario;
	}

	public Integer getTipoSalario() {
		return tipoSalario;
	}

	public void setTipoSalario(Integer tipoSalario) {
		this.tipoSalario = tipoSalario;
	}

	public Integer getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}

	public Integer getMaisDeUmVinculoEmpregaticio() {
		return maisDeUmVinculoEmpregaticio;
	}

	public void setMaisDeUmVinculoEmpregaticio(Integer maisDeUmVinculoEmpregaticio) {
		this.maisDeUmVinculoEmpregaticio = maisDeUmVinculoEmpregaticio;
	}

	public Integer getIdRegraDeCalculo() {
		return idRegraDeCalculo;
	}

	public void setIdRegraDeCalculo(Integer idRegraDeCalculo) {
		this.idRegraDeCalculo = idRegraDeCalculo;
	}

	public int getCodigoPis() {
		return codigoPis;
	}

	public void setCodigoPis(int codigoPis) {
		this.codigoPis = codigoPis;
	}
	
	public void coletaDados() {
		System.out.println("Digite o cracha:");
        cracha = sc.nextInt();

        System.out.println("Digite a matricula:");
        matricula = sc.nextInt();

        System.out.println("Digite o nome:");        
        name = sc.next();

        System.out.println("Digite o CPF:");
        cpf = sc.nextInt();

        System.out.println("Digite a data de amissão:");
        dataAdmissao = sc.next();

        System.out.println("Digite o id da Estrutura:");
        idEstrutura = sc.nextInt();

        System.out.println("Digite o valor de tipoDoFuncionario:");
        System.out.println("1= Normal / 2 = cooperado / 3 = Estagiario / 4 funcionario terceiro");
        tipoDoFuncionario = sc.nextInt();

        System.out.println("Digite o valor de tipoSalario:");
        System.out.println("funcionário. 101 = Mensalista, 102 = Horista");
        tipoSalario = sc.nextInt();   

        System.out.println("Digite o valor de idHorario:");
        idHorario = sc.nextInt();

        System.out.println("Digite o valor de maisDeUmVinculoEmpregaticio:");
        maisDeUmVinculoEmpregaticio = sc.nextInt();

        System.out.println("Digite o valor de idRegraDeCalculo:");
        idRegraDeCalculo = sc.nextInt();

        System.out.println("Digite o valor de codigoPis:");
        codigoPis = sc.nextInt();	
        
        sc.next().trim();
		
	}

	@Override
	public String toString() {
		return "SavePerson{" + "cracha=" + cracha + ", matricula=" + matricula + ", id=" + id + ", name='" + name + '\''
				+ ", cpf='" + cpf + '\'' + ", dataAdmissao='" + dataAdmissao + '\'' + ", idEstrutura=" + idEstrutura
				+ ", tipoDoFuncionario=" + tipoDoFuncionario + ", tipoSalario=" + tipoSalario + ", idSalario="
				+ ", idHorario=" + idHorario + ", maisDeUmVinculoEmpregaticio="
				+ maisDeUmVinculoEmpregaticio + ", idRegraDeCalculo=" + idRegraDeCalculo + ", codigoPis='" + codigoPis
				+ '\'' + '}';
	}
}