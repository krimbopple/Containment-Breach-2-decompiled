Function TXZ2FZDXZZX%(arg0%, arg1%, arg2%, arg3%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    If (T484F2XDF <> Null) Then
        Return $00
    EndIf
    XD6X802XD4(arg3)
    TZ86Z42B8B($01)
    TZ80208B4X(arg1)
    T24X4Z80F4((Int ((Float TX2XZFFZXB4()) * 0.06)))
    If (T204Z846BZ() = $00) Then
        Return $00
    EndIf
    TXFDB4DF0D2(TZXD22F828(), $FA2, arg2)
    local0 = $00
    TXFDB4DF0D2(TZXD22F828(), $FA3, local0)
    local1 = T20DD48F0X6()
    If (local1 = $00) Then
        Return $00
    EndIf
    local2 = $FFFFFFFF
    If (opt\Field24 <> "") Then
        For local3 = $00 To (local1 - $01) Step $01
            If (T2ZB824444(local3) = opt\Field24) Then
                local2 = TXFZ68B4ZFZ(local3)
                Exit
            EndIf
        Next
    EndIf
    If (TB620ZZ04Z(local2) = $00) Then
        Return $00
    EndIf
    T484F2XDF = (New XDF6060F82)
    T484F2XDF\Field8 = XD2ZF6622Z(TX2XZFFZXB4(), D2XFF4X62(), $00, $00, $00)
    T484F2XDF\Field0 = createbank((X4XDZ864X8() Shl $01))
    T484F2XDF\Field1 = createbank($00)
    TXB86X4FDDF(T484F2XDF\Field8, $08, 2.0)
    Return $00
End Function
