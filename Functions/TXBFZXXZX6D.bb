Function TXBFZXXZX6D%(arg0$, arg1%, arg2.T484FFBZX, arg3%, arg4%)
    Local local0.T402X2Z846
    Local local1%
    Local local2%
    Local local3%
    Local local4.T402X2Z846
    Local local5%
    Local local6%
    Local local7$
    Local local8$
    Local local9$
    Local local10%
    Local local11%
    Local local12%
    Local local13$
    Local local14%
    Local local15%
    Local local16$
    Local local17%
    local1 = $00
    local2 = $00
    If (arg2 = Null) Then
        For local0 = Each T402X2Z846
            If (((local0\Field16 = arg1) And (local0\Field29 = arg0)) <> 0) Then
                local3 = local0\Field8
                local0\Field8 = ((((local0\Field10 = $00) Lor (local0\Field10 = $01)) Shl $00) = $00)
                If (local3 <> local0\Field8) Then
                    If (local3 <> 0) Then
                        shoulddeletegadgets = $01
                    EndIf
                    local1 = $01
                EndIf
                local0\Field11 = ((local0\Field29 + ":") + (Str local0\Field16))
                local0\Field21 = "-"
                local0\Field6 = "-"
                local0\Field20 = $00
                local0\Field9 = $00
                local0\Field25 = $00
                local0\Field18 = $00
                local0\Field23 = ""
                local0\Field14 = "-"
                local0\Field26 = $00
                local0\Field7 = $00
            EndIf
        Next
    Else
        If (arg4 = $01) Then
            For local0 = Each T402X2Z846
                If (((local0\Field16 = arg1) And (local0\Field29 = arg0)) <> 0) Then
                    If (local0\Field8 = $00) Then
                        local1 = $01
                    EndIf
                    local0\Field8 = $01
                    local4 = local0
                    If (local0\Field2 <> 0) Then
                        local2 = $01
                        local0\Field2 = $00
                    EndIf
                EndIf
            Next
        Else
            TX28D20DD08(arg2)
            local5 = TX28D20DD08(arg2)
            local6 = TX28D20DD08(arg2)
            local7 = T2X820D0FD(arg2)
            local8 = T2X820D0FD(arg2)
            local9 = T2X820D0FD(arg2)
            local10 = TX28D20DD08(arg2)
            local11 = (Int min((Float TX28D20DD08(arg2)), 4.0))
            If (difficulties[local11]\Field0 <> 0) Then
                TB0B4Z6880(arg2, $04)
            EndIf
            local12 = TX28D20DD08(arg2)
            local13 = T2X820D0FD(arg2)
            local14 = TX28D20DD08(arg2)
            local15 = TX28D20DD08(arg2)
            local16 = T2X820D0FD(arg2)
            If (local16 = "") Then
                local16 = "-"
            EndIf
            local17 = T20024FDF4X(arg2)
            For local0 = Each T402X2Z846
                If (((local0\Field16 = arg1) And (local0\Field29 = arg0)) <> 0) Then
                    If (local0\Field8 = $00) Then
                        local1 = $01
                    EndIf
                    local0\Field11 = local7
                    local0\Field21 = local8
                    local0\Field20 = local5
                    local0\Field9 = local6
                    local0\Field28 = local11
                    local0\Field6 = local9
                    local0\Field19 = local10
                    local0\Field25 = (Int min(max((Float arg3), 5.0), 65535.0))
                    local0\Field17 = local12
                    local0\Field23 = local13
                    local0\Field18 = local14
                    local0\Field14 = local16
                    local0\Field26 = local17
                    local0\Field7 = local15
                    local0\Field8 = $01
                    If (local0\Field2 <> 0) Then
                        local2 = $01
                        local0\Field2 = $00
                    EndIf
                    local4 = local0
                EndIf
            Next
        EndIf
        If (local4 <> Null) Then
            If (arg4 = $01) Then
                X88D840448(getlocalstring("mpmenu", "information"), ((((((((((((((((((((((format(getlocalstring("mpmenu", "info.name"), local4\Field11, "%s") + "\n&w[]") + format(getlocalstring("mpmenu", "info.gamemode"), local4\Field21, "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.players"), (((Str local4\Field20) + " / ") + (Str local4\Field9)), "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.diff"), difficulties[local4\Field28]\Field7, "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.seed"), local4\Field6, "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.mapsize"), (((Str local4\Field7) + "x") + (Str local4\Field7)), "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.intro"), TXX4XX846F(local4\Field19), "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.voice"), X8X4D0ZD08(local4\Field17), "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.ping"), (Str local4\Field25), "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.modded"), TXX4XX846F((local4\Field23 <> "")), "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.version"), XZF4X2066X(local4\Field26), "%s")) + "\n&w[]") + format(getlocalstring("mpmenu", "info.desc"), local4\Field14, "%s")), getlocalstring("gui", "close"), "", $00, $00, $00, $00)
            EndIf
            If (local2 <> 0) Then
                F4ZXX4FDZ(local4, $00, $00)
            EndIf
        EndIf
    EndIf
    If (local1 <> 0) Then
        B24D0X6Z8(TXFD22D0402\Field3)
    EndIf
    Return $00
End Function
