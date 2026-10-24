Function T2F4ZB48XD%(arg0%, arg1%, arg2%)
    Local local0%
    If (((arg2 = $00) And mainmenuopen) <> 0) Then
        AZZDXFBD6()
        local0 = XBZ26ZF22B(arg0, arg1, X46X8DF2DZ())
        If (local0 <> $00) Then
            FZXXZB468()
            DXZB2X008()
        EndIf
        TX0D6ZF4FX0($01)
    ElseIf (mainmenuopen = $00) Then
        renderloading(99.5, format(getlocalstring("mpmenu", "queue"), (Str arg2), "%s"), $00, 0.025)
    EndIf
    Return $00
End Function
