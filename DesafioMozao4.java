/* DESAFIO #4 DO MOZÃO
*
* Descrição geral: Carla está levando a sério o programa em Java para controle das plantas e deseja incrementá-lo. Agora, ela quer
*                  indicar quando a planta é sua favorita e também quando pretende comprá-la.
*
* Objetivo: alterar o Método que imprime os dados da planta para que, quando o atributo NivelInteresse seja igual a 3, ele diga que
*           esta é uma planta Favorita e será comprada daqui X dias. Considere que deverá ser criado um atributo para guardar o
*           provável dia de compra e que este, por simplicidade, será no mesmo mês corrente.
*           
*           Exemplo: hoje é dia 21 e a provável data de compra da planta é dia 27. Logo, ela será comprada daqui 6 dias.
*           Exemplo: hoje é dia 21 e a provável data de compra da planta é dia 31. Logo, ela será comprada daqui 10 dias.
*
* Obs1.: para pegar o dia de hoje do sistema, você pode utilizar as 4 linhas abaixo no seu código:

        Date data = new Date();
    	Calendar calendario = Calendar.getInstance();
    	calendario.setTime(data);
    	int diaHoje = calendario.get(Calendar.DAY_OF_MONTH);

        ---

        Para funcionar, utilize os 2 imports a seguir na sua classe:

        import java.util.Calendar;
        import java.util.Date;

* Obs2.: se a conta que você fizer para chegar à quantidade de dias para a compra da planta der negativo, diga que ela será
*        comprada mês que vem. Se a conta der 0 (zero), diga que será comprada hoje. Se a conta der 1 (um), diga que será
*        comprada amanhã. Para todos os outros casos, pode usar o número de dias mesmo.
*/