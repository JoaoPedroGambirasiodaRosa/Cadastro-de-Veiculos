package br.ulbra.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author JPGR
 */
public class VeiculosDao {
    Connection con;
    
    public VeiculosDao() throws SQLException{
        con = ConnectionFactory.getConnection();
    }
    
    public void create(Veiculos u){
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO tbusuario (nome,"
                    + "email,senha,tipo) VALUE (?,?,?,?)");
            stmt.setString(1, u.getmarca());
            stmt.setString(2, u.getmodelo());
            stmt.setInt   (3, u.getano());
            stmt.setString(4, u.getcor());
            stmt.setString(5, u.getplaca());
            stmt.setString(6, u.getmotor());
            stmt.setInt   (7, u.getkm());
            stmt.setDouble(8, u.getvalorFipe());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Veiculo "+u.getplaca()
                    +" Salvo com Sucesso!!");
   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:"+e.getMessage());
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
     //listagem de usuarios na tabela do formulario   ---   R
    
    public ArrayList<Veiculos> read(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Veiculos> veiculos = new ArrayList<Veiculos>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbveiculos");
            rs = stmt.executeQuery();
            while(rs.next()){
                Veiculos Veiculos = new Veiculos();
                Veiculos.setId(rs.getInt("id"));
                Veiculos.setmarca(rs.getString("Marca"));
                Veiculos.setmodelo(rs.getString("Modelo"));
                Veiculos.setano(rs.getInt("Ano"));
                Veiculos.setcor(rs.getString("Cor"));
                Veiculos.setplaca(rs.getString("Placa"));
                Veiculos.setmotor(rs.getString("Motor"));
                Veiculos.setkm(rs.getInt("Km"));
                Veiculos.setvalorFipe(rs.getDouble("Tabela Fipe"));
                Veiculos.add(Veiculos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro:"+e.getMessage());
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Veiculos>) veiculos;
    }
    
    public ArrayList<Veiculos> readPesq(String placa){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Veiculos> Veiculos = new ArrayList<Veiculos>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbveiculos WHERE marca LIKE ?");
            stmt.setString(1, "%"+placa+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
                Veiculos veiculos = new Veiculos();
                veiculos.setId(rs.getInt("id"));
                veiculos.setmarca(rs.getString("Marca"));
                veiculos.setmodelo(rs.getString("Modelo"));
                veiculos.setano(rs.getInt("Ano"));
                veiculos.setcor(rs.getString("Cor"));
                veiculos.setplaca(rs.getString("Placa"));
                veiculos.setmotor(rs.getString("Motor"));
                veiculos.setkm(rs.getInt("Km"));
                veiculos.setvalorFipe(rs.getDouble("Tabela Fipe"));
                veiculos.add(veiculos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro:"+e.getMessage());
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Veiculos>) Veiculos;
    }
    
    //ALTERAR O USUARIO NO BANCO DE DADOS   -- U 
    public void update(Veiculos u){
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE tbusuario SET nome = ?,"
                    + "email = ?, senha = ? ,tipo = ? WHERE id = ?");
            stmt.setString(1, u.getmarca());
            stmt.setString(2, u.getmodelo());
            stmt.setInt(3, u.getano());
            stmt.setString(4, u.getcor());
            stmt.setString(5, u.getplaca());
            stmt.setString(6, u.getmotor());
            stmt.setInt(7, u.getkm());
            stmt.setDouble(8, u.getvalorFipe());
            stmt.setInt   (9, u.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Veiculo "+u.getplaca()
                    +" Modificado com Sucesso!!");
   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:"+e.getMessage());
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    //excluir do banco de dados   --- D
    public void delete(Veiculos u){
            PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM tbveiculos WHERE id = ?");
           
            stmt.setInt   (1, u.getId());
            
            if (JOptionPane.showConfirmDialog(null,"Exclusão", "Tem certeza que"
                    + " deseja excluir o Veiculo(a)"+u.getplaca(),
                    JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Veiculo(a) "+u.getplaca()
                    +" excluído(a)com Sucesso!!");
                stmt.executeUpdate();
            }else{
                JOptionPane.showMessageDialog(null, "A exclusão do Veiculo(a) "+u.getplaca()
                    +" Cancelado(a)com Sucesso!!");
            }
   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:"+e.getMessage());
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
   
}
