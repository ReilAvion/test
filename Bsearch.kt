import java.util.Scanner
import java.util.Arrays;


fun main(Args:Array<String>) {

    var angka:Int
    var size:Int
    println("Program Binary Search")
    println()
    println("Kumpulan data Array of Random")
    var notfound = true
    val sc = Scanner(System.`in`)

    print("Masukan Ukuran Array = ")
    size = sc.nextInt()
    var intarray = DoubleArray(size)
    for (i in 0 until size)
    {
        intarray[i] = (size) as Double
    }
    Arrays.sort(intarray)
    for (j in 0 until size)
    {
    }
    print("\nMasukan angka yang ingin dicari = ")
    angka = sc.nextInt()
    val startTime = System.currentTimeMillis().toDouble()

    var batasAtas = intarray.size - 1
    var batasBawah = 0
    while (notfound == true)
    {
        val posisiSekarang = (batasAtas + batasBawah) / 2
        if (intarray[posisiSekarang] == angka.toDouble())
        {
            notfound = false
            println("Angka " + angka + " ditemukan")
        }
        else if (batasBawah > batasAtas)
        {
            println("Angka " + angka + " tidak ditemukan")
            break
        }
        else
        {
            if (intarray[posisiSekarang] < angka)
            {
                 batasBawah = posisiSekarang + 1
            }
            else
            {
                 batasAtas = posisiSekarang - 1
            }
        }
    }
    if (size <= 10000)
    {
        val estimated1 = System.currentTimeMillis() - startTime
        println("Waktu eksekusi = " + estimated1 + " Milisekon")
    }
    else
    {
        val estimated2 = (System.currentTimeMillis() - startTime) * 0.001
        println("Waktu eksekusi = " + estimated2 + " sekon")
    }
}
