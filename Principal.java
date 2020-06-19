package exemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	//Conceito principal!! Ter um CD, Artista e Produtora, Artisa e Produtora se ligam a CD
	//Cada classe possui 3 elementos, Principal.java executa eles fazendo a conexcao ao banco
	//Ocorre uma busca SQL no aplicativo Java
	
	
	
	
	public static void main(String[] args) {
		
		//Conexao
        String connectionUrl = "jdbc:sqlserver://localhost;databaseName=Avaliacaon2;user=Avaliacaon2;password=24685";
        
        //Set
        
        String insertString = "INSERT INTO Artista (id_artista, nome_artista) VALUES (?, ?)";
        String insertString1 = "INSERT INTO CD (id_cd, nome_cd, id_artista, id_produtora) VALUES (?, ?, ?, ?)";
        String insertString2 = "INSERT INTO Produtora (id_produtora, nome_produtora) VALUES (?, ?)";
        
        //ABAIXO A CRIACAO DE ARTISTAS
        
        	// Adicionar a tabela o Artita 01
        try (
        		Connection con = DriverManager.getConnection(connectionUrl); 
        		PreparedStatement stmt = con.prepareStatement(insertString);
        	) {
        	
        	Artista artista1 = new Artista(1, "Acxle");
        	
        	//==============================
        	stmt.setInt(1, artista1.getId_artista());
        	stmt.setString(2, artista1.getNome_artista());
        	//==============================
        	
        	stmt.executeUpdate();
        
        	//==============================

        } catch (SQLException e) {
        	e.printStackTrace();
        }
        
    	// Adicionar a tabela o Artita 02
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString);
    	) {
    	
    	
    	// Adicionar a tabela o Artita 02
    	Artista artista2 = new Artista(2, "Joji");
    	
    	//==============================
    	stmt.setInt(1, artista2.getId_artista());
    	stmt.setString(2, artista2.getNome_artista());
    	//==============================
    	
    	stmt.executeUpdate();

    	} catch (SQLException e) {
    	e.printStackTrace();
    	}
    
		// Adicionar a tabela o Artita 03
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString);
    	) {
	
	
    	// Adicionar a tabela o Artita 03
    	Artista artista3 = new Artista(3, "N'To");
	
    	//==============================
    	stmt.setInt(1, artista3.getId_artista());
    	stmt.setString(2, artista3.getNome_artista());
    	//==============================
	
    	stmt.executeUpdate();

    } catch (SQLException e) {
    	e.printStackTrace();
    }
        
  //ABAIXO A CRIACAO DE CDs
    
	// Adicionar a tabela o CD 01
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString1);
    	) {
	
	
    	// Adicionar a tabela o CD 01
    	CD cd1 = new CD(1, "faces", 1, 1);
	
    	//==============================
    	stmt.setInt(1, cd1.getId_cd());
    	stmt.setString(2, cd1.getNome_cd());
    	stmt.setInt(3, cd1.getId_artista());
    	stmt.setInt(4, cd1.getId_produtora());
    	//==============================
	
    	stmt.executeUpdate();

    } catch (SQLException e) {
    	e.printStackTrace();
    } 
    
	// Adicionar a tabela o CD 02
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString1);
    	) {
	
	
    	// Adicionar a tabela o CD 02
    	CD cd2 = new CD(2, "Gimme Love", 2, 2);
	
    	//==============================
    	stmt.setInt(1, cd2.getId_cd());
    	stmt.setString(2, cd2.getNome_cd());
    	stmt.setInt(3, cd2.getId_artista());
    	stmt.setInt(4, cd2.getId_produtora());
    	//==============================
	
    	stmt.executeUpdate();

    } catch (SQLException e) {
    	e.printStackTrace();
    } 
    
	// Adicionar a tabela o CD 03
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString1);
    	) {
	
	
    	// Adicionar a tabela o CD 03
    	CD cd3 = new CD(3, "La Clé Des Champs", 3, 3);
	
    	//==============================
    	stmt.setInt(1, cd3.getId_cd());
    	stmt.setString(2, cd3.getNome_cd());
    	stmt.setInt(3, cd3.getId_artista());
    	stmt.setInt(4, cd3.getId_produtora());
    	//==============================
	
    	stmt.executeUpdate();

    } catch (SQLException e) {
    	e.printStackTrace();
    } 
    
    
    
 // Adicionar a tabela a produtora 01
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString2);
    	) {
	
	
    	// Adicionar a tabela a produtora 01
    	Produtora produtora1 = new Produtora(1, "Inde");
	
    	//==============================
    	stmt.setInt(1, produtora1.getId_produtora());
    	stmt.setString(2, produtora1.getNome_produtora());
    	//==============================
	
    	stmt.executeUpdate();

    } catch (SQLException e) {
    	e.printStackTrace();
    } 
    
    
    // Adicionar a tabela a produtora 02
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString2);
    	) {
	
	
    	// Adicionar a tabela a produtora 02
    	Produtora produtora2 = new Produtora(2, "Pink Guy");
	
    	//==============================
    	stmt.setInt(1, produtora2.getId_produtora());
    	stmt.setString(2, produtora2.getNome_produtora());
    	//==============================
	
    	stmt.executeUpdate();

    } catch (SQLException e) {
    	e.printStackTrace();
    } 
    
    
    // Adicionar a tabela a produtora 03
    try (
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		PreparedStatement stmt = con.prepareStatement(insertString2);
    	) {
	
	
    	// Adicionar a tabela a produtora 03
    	Produtora produtora3 = new Produtora(3, "Hungry Music");
	
    	//==============================
    	stmt.setInt(1, produtora3.getId_produtora());
    	stmt.setString(2, produtora3.getNome_produtora());
    	//==============================
	
    	stmt.executeUpdate();

    } catch (SQLException e) {
    	e.printStackTrace();
    }
    
    

        // faz um SELECT no banco
        try (
        		Connection con = DriverManager.getConnection(connectionUrl); 
        		Statement stmt = con.createStatement();
        	) {
        	
        	//Consulta SQL
            String SQL = "select *  from CD  join Artista on CD.id_artista = Artista.id_artista";
            ResultSet rs = stmt.executeQuery(SQL); 

            
            while (rs.next()) {
            	
            	//Set
            	Artista artista = new Artista();
            	artista.setId_artista(rs.getInt("id_artista"));
            	artista.setNome_artista(rs.getString("nome_artista"));
            	
            	CD cd = new CD();
            	cd.setId_cd(rs.getInt("id_cd"));
            	cd.setNome_cd(rs.getString("nome_cd"));
            	cd.setId_artista(rs.getInt("id_artista"));
            	cd.setId_produtora(rs.getInt("id_produtora"));

            	System.out.println(artista);
            	System.out.println(cd);
            }
        }
        
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        
      //===================================
        
       
     // UPDATE NO ID 1 DA PRODUTORA PARA ALTERAR DE "INDE" PARA "INDEPOP"   
        
      /*
        String updateString = "UPDATE Produtora WHERE id_produtora = ?";
        
        try (
        		Connection con = DriverManager.getConnection(connectionUrl); 
        		PreparedStatement stmt = con.prepareStatement(updateString);
        	) {
        	
        	Produtora produtora1 = new Produtora(1, "IndePop");
        	stmt.setInt(1, produtora1.getId_produtora());
        	stmt.setString(2, produtora1.getNome_produtora());	
        	
        	stmt.executeUpdate(); 
        	
        	System.out.println("Pessoa alterada!");
        	
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        
        */
        
        // ISSO IRA REMOVER O PRODUTORA DE ID 1 "INDE"
        
        String deleteString = "DELETE Produtora WHERE id_produtora=?";
        
        try (
        		Connection con = DriverManager.getConnection(connectionUrl); 
        		PreparedStatement stmt = con.prepareStatement(deleteString);
        	) {
        	
        	int Id_produtora = 1;
        	stmt.setInt(1, Id_produtora);
        	
        	stmt.executeUpdate();
        	
        	System.out.println("Pessoa removida!");
        	
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        
	}
}
