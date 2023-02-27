package Faturamento

class Faturamento {
    companion object {
        fun readData() {


            println("MENOR VALOR")
            lowestValue()
            println("\nMAIOR VALOR")
            bigestValue()
            println("\nVALORES MAIORES QUE A MÉDIA")
            valueBigestThanAvg()
            println("\nPERCENTUAL DOS ESTADOS")
            percentual()
        }

        private fun lowestValue() {
            val minValue = Data.getData().filter { it.valor > 0 }.minBy { it.valor }
            println("O menor valor é ${minValue.valor} alcançado no dia ${minValue.dia}")
        }

        private fun bigestValue() {
            val maxValue = Data.getData().maxBy { it.valor }
            println("O maior valor é ${maxValue.valor} alcançado no dia ${maxValue.dia}")
        }

        private fun valueBigestThanAvg() {
            val avg = Data.getData().filter { it.valor > (it.valor / Data.getData().size) }
            avg.forEach {
                println("Dia ${it.dia} teve valor maior que a média")
            }
        }

        private fun percentual() {
            val states = mutableListOf<Estados>()
            states.add(Estados("SP", 67836.43))
            states.add(Estados("RJ", 36678.66))
            states.add(Estados("MG", 29229.88))
            states.add(Estados("ES", 27165.48))
            states.add(Estados("Outros", 19849.53))

            val totalValue = Data.getData().sumOf { it.valor }

            states.forEach {
                val percentual = it.value / totalValue * 100
                println("${it.id} - R$ ${it.value} - ${percentual} %")
            }


        }
    }


}