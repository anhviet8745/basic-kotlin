package reactive_programming.observable

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.kotlin.toObservable

fun main() {
    val observer: Observer<Any> = object : Observer<Any> {
        override fun onSubscribe(d: Disposable?) {
            println("Subscribed to $d")
        }

        override fun onNext(t: Any?) {
            println("Next $t")
        }

        override fun onError(e: Throwable?) {
            println("Error Occured $e")
        }

        override fun onComplete() {
            println("All Completed")
        }
    }

    val observable: Observable<Any> = listOf("One", 2, "Three", "Four", 4.5, "Five", 6.0f).toObservable()

    observable.subscribe(observer)

    val observableOnList: Observable<List<Any>> = Observable.just(
            listOf("One", 2, "Three", "Four", 4.5, "Five", 6.0f),
            listOf("List with Single Item"),
            listOf(1, 2, 3, 4, 5, 6)
    )

    observableOnList.subscribe(observer)

}