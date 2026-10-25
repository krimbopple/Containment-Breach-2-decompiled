Function GUESSEDmenumpmenu%(arg0.T402X2Z846, arg1%, arg2%)
    If (arg0 = Null) Then
        Return $00
    EndIf
    If (arg1 <> 0) Then
        GUESSEDresetresetinput(getlocalstring("mpmenu", "connect2"), format(getlocalstring("mpmenu", "connecting"), arg0\Field11, "%s"), getlocalstring("gui", "cancel"), "", $00, FuncPtr(TX4B08ZX6D0), $01, $7530)
        GUESSEDsetglobal_14((Handle arg0))
        MP_SendLocalPlayer(IPToDecimal(arg0\Field29), arg0\Field16)
        Return $00
    EndIf
    If (arg2 = $00) Then
        T64ZZ6Z68F\Field2 = ""
        If (arg0\Field18 <> 0) Then
            GUESSEDresetresetinput(getlocalstring("mpmenu", "connect2"), getlocalstring("mpmenu", "enterpassword"), getlocalstring("gui", "ok"), getlocalstring("gui", "cancel"), $02, FuncPtr(T28Z8BF48F), $01, $00)
            GUESSEDsetglobal_14((Handle arg0))
            Return $00
        EndIf
    EndIf
    GUESSEDresetresetinput(getlocalstring("mpmenu", "connect2"), format(getlocalstring("mpmenu", "connecting"), arg0\Field11, "%s"), getlocalstring("gui", "cancel"), "", $00, FuncPtr(TX4B08ZX6D0), $01, $7530)
    GUESSEDsetglobal_14((Handle arg0))
    If (GUESSEDcallmenumpmenu_2(arg0) <> 0) Then
        MP_SendLocalPlayer(IPToDecimal(arg0\Field29), arg0\Field16)
    EndIf
    Return $00
End Function
