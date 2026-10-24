Function XX226ZZXZB$(arg0$, arg1%, arg2%)
    Local local0$
    Local local1%
    Local local2$
    Local local3%
    Local local4$
    Local local5#
    Local local6%
    Local local7%
    Local local8%
    Local local9.TX4BBZDZ08F
    Local local11%
    local0 = XX8XZZFFF(arg0)
    local1 = len(local0)
    If (local1 = $00) Then
        Return ""
    EndIf
    local2 = ""
    For local3 = $01 To local1 Step $01
        local4 = mid(local0, local3, $01)
        For local9 = Each TX4BBZDZ08F
            If (local9\Field2 = (local3 - $01)) Then
                Select local9\Field3
                    Case $01
                        local2 = (((local2 + "&c[") + local9\Field0) + "]")
                    Case $02
                        local2 = (((local2 + "&i[") + local9\Field0) + "]")
                    Case $03
                        local2 = (((local2 + "&hl[") + local9\Field0) + "]")
                End Select
            EndIf
        Next
        local11 = $00
        For local9 = Each TX4BBZDZ08F
            If (((local9\Field3 = $01) And ((local3 - $01) >= local9\Field2)) <> 0) Then
                local11 = $01
                Exit
            EndIf
        Next
        If (local11 = $00) Then
            local5 = ((Float local3) / (Float local1))
            local6 = (Int (((Float readpixelcolor(arg1, $10)) * (1.0 - local5)) + ((Float readpixelcolor(arg2, $10)) * local5)))
            local7 = (Int (((Float readpixelcolor(arg1, $08)) * (1.0 - local5)) + ((Float readpixelcolor(arg2, $08)) * local5)))
            local8 = (Int (((Float readpixelcolor(arg1, $00)) * (1.0 - local5)) + ((Float readpixelcolor(arg2, $00)) * local5)))
            local2 = (((((((local2 + "&c[") + (Str local6)) + " ") + (Str local7)) + " ") + (Str local8)) + "]")
        EndIf
        local2 = (local2 + local4)
    Next
    Return local2
    Return ""
End Function
