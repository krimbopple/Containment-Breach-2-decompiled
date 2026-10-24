Function XBZ26ZF22B%(arg0%, arg1%, arg2.T484FFBZX)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4.T402X2Z846
    Local local5$
    Local local6.T402X2Z846
    If (((T2XZF288FFX() = $00) And DFZ0X0FD4()) <> 0) Then
        Return $0E
    EndIf
    T64ZZ6Z68F\Field4 = arg0
    T64ZZ6Z68F\Field0 = arg1
    TX28D20DD08(arg2)
    local0 = TX28D20DD08(arg2)
    T8X2046020\Field17 = TX28D20DD08(arg2)
    If (((local0 >= T8X2046020\Field17) And (T2XZF288FFX() <> $00)) <> 0) Then
        Return $02
    EndIf
    T8X2046020\Field6 = T2X820D0FD(arg2)
    T2X820D0FD(arg2)
    randomseed = T2X820D0FD(arg2)
    local1 = TX28D20DD08(arg2)
    opt\Field3 = T20FFXB28X8(local1, $00)
    T8X2046020\Field12 = T20FFXB28X8(local1, $01)
    If (opt\Field3 <> $00) Then
    EndIf
    selecteddifficulty = difficulties[(Int min((Float TX28D20DD08(arg2)), 4.0))]
    If (selecteddifficulty\Field0 <> 0) Then
        selecteddifficulty\Field2 = TX28D20DD08(arg2)
        selecteddifficulty\Field1 = TX28D20DD08(arg2)
        selecteddifficulty\Field4 = TX28D20DD08(arg2)
        selecteddifficulty\Field8 = TX28D20DD08(arg2)
    EndIf
    local2 = (TX28D20DD08(arg2) * $3E8)
    If (T2X820D0FD(arg2) <> "") Then
        local3 = $00
        For local4 = Each T402X2Z846
            If (len(local4\Field1) > $00) Then
                local3 = $01
                Exit
            EndIf
        Next
        If (local3 = $00) Then
            Return $0B
        EndIf
    EndIf
    TX28D20DD08(arg2)
    T8X2046020\Field24 = TX28D20DD08(arg2)
    T2X820D0FD(arg2)
    If (((T2XZF288FFX() <> $00) And (T20024FDF4X(arg2) <> $20105)) <> 0) Then
        T8X2046020\Field12 = $00
        T8X2046020\Field24 = $00
        Return $01
    EndIf
    If (local2 = $00) Then
        local2 = $FFFFFC18
    EndIf
    TXZ2FZDXZZX($FFFFFFFF, $BB80, local2, $800)
    If (T2XZF288FFX() = $00) Then
        YX0B0D2DF6(dottedip(arg0), arg1, $02)
    EndIf
    TX0D6ZF4FX0($00)
    currsave = (New save)
    loadcustommaps()
    currcustommap = (New custommaps)
    initnewgame()
    shoulddeletegadgets = $01
    TFF8FFBBDD((30.0 * menuscale), ((Float opt\Field46) - (50.0 * menuscale)))
    local5 = dottedip(T64ZZ6Z68F\Field4)
    For local6 = Each T402X2Z846
        If (((local6\Field16 = arg1) And (local6\Field29 = local5)) <> 0) Then
            T8X2046020\Field2 = local6
            Exit
        EndIf
    Next
    Return T64ZZ6Z68F\Field1
    Return $00
End Function
