Function GUESSEDinitdotted%(arg0%, arg1%, arg2.T484FFBZX)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4.T402X2Z846
    Local local5$
    Local local6.T402X2Z846
    If (((MP_IsConnected() = $00) And GUESSEDupdateobjects_4()) <> 0) Then
        Return $0E
    EndIf
    T64ZZ6Z68F\Field4 = arg0
    T64ZZ6Z68F\Field0 = arg1
    GUESSEDsetpeek_3(arg2)
    local0 = GUESSEDsetpeek_3(arg2)
    T8X2046020\Field17 = GUESSEDsetpeek_3(arg2)
    If (((local0 >= T8X2046020\Field17) And (MP_IsConnected() <> $00)) <> 0) Then
        Return $02
    EndIf
    T8X2046020\Field6 = GUESSEDsetpeek_2(arg2)
    GUESSEDsetpeek_2(arg2)
    randomseed = GUESSEDsetpeek_2(arg2)
    local1 = GUESSEDsetpeek_3(arg2)
    opt\Field3 = ReadBool(local1, $00)
    T8X2046020\Field12 = ReadBool(local1, $01)
    If (opt\Field3 <> $00) Then
    EndIf
    selecteddifficulty = difficulties[(Int min((Float GUESSEDsetpeek_3(arg2)), 4.0))]
    If (selecteddifficulty\Field0 <> 0) Then
        selecteddifficulty\Field2 = GUESSEDsetpeek_3(arg2)
        selecteddifficulty\Field1 = GUESSEDsetpeek_3(arg2)
        selecteddifficulty\Field4 = GUESSEDsetpeek_3(arg2)
        selecteddifficulty\Field8 = GUESSEDsetpeek_3(arg2)
    EndIf
    local2 = (GUESSEDsetpeek_3(arg2) * $3E8)
    If (GUESSEDsetpeek_2(arg2) <> "") Then
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
    GUESSEDsetpeek_3(arg2)
    T8X2046020\Field24 = GUESSEDsetpeek_3(arg2)
    GUESSEDsetpeek_2(arg2)
    If (((MP_IsConnected() <> $00) And (GUESSEDsetpeek(arg2) <> $20105)) <> 0) Then
        T8X2046020\Field12 = $00
        T8X2046020\Field24 = $00
        Return $01
    EndIf
    If (local2 = $00) Then
        local2 = $FFFFFC18
    EndIf
    GUESSEDcreaterecord($FFFFFFFF, $BB80, local2, $800)
    If (MP_IsConnected() = $00) Then
        GUESSEDcreatedotted(dottedip(arg0), arg1, $02)
    EndIf
    GUESSEDupdateobjects_10($00)
    currsave = (New save)
    loadcustommaps()
    currcustommap = (New custommaps)
    initnewgame()
    shoulddeletegadgets = $01
    GUESSEDrenderrenderhud((30.0 * menuscale), ((Float opt\Field46) - (50.0 * menuscale)))
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
