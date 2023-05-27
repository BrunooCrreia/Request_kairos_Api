package application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.InputMismatchException;

import entities.SavePerson;
import entities.service.ScannerInterface;

public class Program {
	public static void main(String[] args) {
		boolean continueCadastro = true;

		while (continueCadastro == true) {
			try {
				// URL do endpoint da API
				URL url = new URL("https://www.dimepkairos.com.br/RestServiceApi/People/SavePerson");

				SavePerson sp = new SavePerson();

				sp.coletaDados();

				// Configuração da conexão HTTP
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("POST");
				connection.setRequestProperty("Content-Type", "application/json");
				connection.setRequestProperty("identifier", "51.761.755/0001-40");
				connection.setRequestProperty("key", "53726cee-d97c-4b97-bea7-f47bb3472a04");
				connection.setDoOutput(true);

				// Corpo da requisição
				String requestBody = sp.toString(); // Exemplo de corpo de requisição

				// Envio do corpo da requisição
				OutputStream outputStream = connection.getOutputStream();
				outputStream.write(requestBody.getBytes());
				outputStream.flush();

				// Verificação do código de resposta
				int responseCode = connection.getResponseCode();
				System.out.println("Response Code: " + responseCode);

				// Leitura da resposta da API
				BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String line;
				StringBuilder response = new StringBuilder();
				while ((line = reader.readLine()) != null) {
					response.append(line);
				}
				reader.close();

				// Exibição da resposta da API
				System.out.println("Response: " + response.toString());

				// Fechamento da conexão
				connection.disconnect();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				do {
				    System.out.println("Deseja cadastrar mais algum colaborador? (sim/não)");
				    String resp = ScannerInterface.sc.next().trim();;
				    try {
				        if (resp.equalsIgnoreCase("sim")) {
				        	continueCadastro = true;
				            // Código para continuar o cadastro
				        } else if (resp.equalsIgnoreCase("não")) {
				        	continueCadastro = false;
				            // Código para encerrar o cadastro
				        } else {
				            throw new InputMismatchException();
				        }
				    } catch (InputMismatchException e) {
				        System.out.println("Valor digitado inválido. Por favor, digite 'sim' ou 'não'.");
				    }
				} while (!continueCadastro);			
			}
		}

	}
}
