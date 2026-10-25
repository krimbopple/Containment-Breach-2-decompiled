Function MP_Update%()
    Local local0.TX2BF6X0FF4
    catcherrors("MP_Update()")
    _Steam_Update()
    GUESSEDreadudp()
    GUESSEDcreatebank()
    GUESSEDresetnullgame()
    If (X40BZ0ZDD8\Field2 <> $00) Then
        Return Steam_Update()
    EndIf
    If (GUESSEDupdatexdb() = $00) Then
        Return $00
    EndIf
    mp_UpdatePlayers()
    If (GUESSEDupdateanimatenpc() <> 0) Then
        GUESSEDcallunknownxf8z8f()
        GUESSEDcheckvalue_50()
        GUESSEDprocessmessages()
        MP_BroadcastTo()
        GUESSEDsettxxf()
        GUESSEDsetdd()
        GUESSEDcallupdateobjects()
    Else
        MP_UpdatePing()
        GUESSEDprocessmessages_2()
        GUESSEDinputentity_2()
        T8X2046020\Field11 = (T8X2046020\Field11 + MP_GetLoadingProgress())
        If (70.0 <= T8X2046020\Field11) Then
            For local0 = Each TX2BF6X0FF4
                GUESSEDsetfield_17(local0)
            Next
        EndIf
        If (((MP_IsConnected() = $01) And (1050.0 < T8X2046020\Field11)) <> 0) Then
            GUESSEDinitinitnewgame_7($04, "", $01)
        EndIf
    EndIf
    catcherrors("Uncaught: MP_Update()")
    Return $00
End Function
