Function F4ZXX4FDZ%(arg0.T402X2Z846, arg1%, arg2%)
    If (arg0 = Null) Then
        Return $00
    EndIf
    If (arg1 <> 0) Then
        X88D840448(getlocalstring("mpmenu", "connect2"), format(getlocalstring("mpmenu", "connecting"), arg0\Field11, "%s"), getlocalstring("gui", "cancel"), "", $00, FuncPtr(TX4B08ZX6D0), $01, $7530)
        TX6X82B2D02((Handle arg0))
        YX0D84FX06(T464B0FBXX(arg0\Field29), arg0\Field16)
        Return $00
    EndIf
    If (arg2 = $00) Then
        T64ZZ6Z68F\Field2 = ""
        If (arg0\Field18 <> 0) Then
            X88D840448(getlocalstring("mpmenu", "connect2"), getlocalstring("mpmenu", "enterpassword"), getlocalstring("gui", "ok"), getlocalstring("gui", "cancel"), $02, FuncPtr(T28Z8BF48F), $01, $00)
            TX6X82B2D02((Handle arg0))
            Return $00
        EndIf
    EndIf
    X88D840448(getlocalstring("mpmenu", "connect2"), format(getlocalstring("mpmenu", "connecting"), arg0\Field11, "%s"), getlocalstring("gui", "cancel"), "", $00, FuncPtr(TX4B08ZX6D0), $01, $7530)
    TX6X82B2D02((Handle arg0))
    If (X2BD22Z2BX(arg0) <> 0) Then
        YX0D84FX06(T464B0FBXX(arg0\Field29), arg0\Field16)
    EndIf
    Return $00
End Function
