package lotto

const val LOTTO_PRICE = 1000

class LottoMachine(lottoGenerator: LottoGenerator, private val money: Int) {
    val issuedLottos = (0 until issuedLottoSize(money)).map { lottoGenerator.generate() }

    fun issueStatistics(winningLotto: Lotto): Statistics {
        val statistics = issuedLottos.groupingBy { it.matchedCount(winningLotto) }.eachCount()
        return Statistics(money, statistics)
    }

    private fun issuedLottoSize(money: Int): Int {
        return money / LOTTO_PRICE
    }
}
