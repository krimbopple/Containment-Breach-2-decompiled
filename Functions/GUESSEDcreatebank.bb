Function GUESSEDcreatebank%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    If (T484F2XDF = Null) Then
        Return $00
    EndIf
    local0 = BASS_ChannelGetData(T484F2XDF\Field8, T484F2XDF\Field0, $00)
    If (1.0 <= GUESSEDcheckvalue_9(local0)) Then
        local1 = createbank((Int ((Float local0) * 1.25)))
        BASS_ChannelGetData(T484F2XDF\Field8, local1, banksize(local1))
        freebank(local1)
        local1 = $00
    EndIf
    If (GUESSEDgetglobal_3() <> 0) Then
        resizebank(T484F2XDF\Field1, $00)
        If (BASS_ChannelGetData(T484F2XDF\Field8, T484F2XDF\Field0, $00) >= banksize(T484F2XDF\Field0)) Then
            BASS_ChannelGetData(T484F2XDF\Field8, T484F2XDF\Field0, banksize(T484F2XDF\Field0))
            local3 = opus_pcm_encode(T484F2XDF\Field0)
            If (local3 <> $00) Then
                GUESSEDcopybank_2(local3, $00, T484F2XDF\Field1, banksize(local3))
                freebank(local3)
                local3 = $00
            EndIf
        EndIf
    EndIf
    GUESSEDinputkey_2()
    Return $00
End Function
