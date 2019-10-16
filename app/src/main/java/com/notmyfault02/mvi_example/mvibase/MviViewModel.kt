package com.notmyfault02.mvi_example.mvibase

import io.reactivex.Observable

interface MviViewModel<I: MviIntent, S: MviViewState> {

    fun processIntent(intents: Observable<I>)

    fun states(): Observable<S>
}