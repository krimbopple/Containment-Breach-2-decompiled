Function XZB82X0FXD%(arg0%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4.TX2BF6X0FF4
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    Local local11%
    Local local12%
    Local local13%
    Local local14%
    Local local15%
    Local local16%
    Local local17$
    Local local18%
    Local local19%
    Local local20%
    Local local21%
    Local local22#
    Local local23#
    If (T84F6Z402D\Field2 <> 0) Then
        If (arg0 <> 0) Then
            rendermenubuttons()
        EndIf
        setfontex(XD00026ZX2\Field0[$00])
        local0 = (Int (700.0 * menuscale))
        local1 = (Int (80.0 * menuscale))
        local2 = (Int (35.0 * menuscale))
        local3 = $00
        For local4 = Each TX2BF6X0FF4
            local3 = (local3 + $01)
            If (local3 <= $08) Then
                local1 = ((local1 + local2) - $01)
            EndIf
        Next
        local5 = (Int ((Float opt\Field21) / 2.0))
        local6 = (Int (((Float opt\Field46) / 2.0) + (15.0 * menuscale)))
        local7 = (Int ((Float local6) - ((Float local1) / 2.0)))
        local8 = (Int ((Float local0) * 0.05))
        local9 = (Int ((Float local0) * 0.05))
        local10 = (Int ((Float local0) * 0.07))
        local11 = (local5 - (local0 Sar $01))
        local12 = ((local11 + local0) - local8)
        local13 = ((local12 - local9) + $01)
        local14 = ((local13 - local10) + $01)
        color($FF, $FF, $FF, $FF)
        X44ZBBZ44X((Float local5), (Float ((Int (12.0 * menuscale)) + local7)), XX8XZZFFF((((((T8X2046020\Field6 + " &col[ffffff](") + (Str local3)) + " / ") + (Str T8X2046020\Field17)) + ")")), $01, $00, 1.0, $00, 0.0)
        local15 = ((Int (30.0 * menuscale)) + local7)
        AD6628F0D = Null
        Y68BX8F44 = $00
        B0D0444FB = $00
        T2XDZFBBBZ = $00
        EBB4F42D2 = $00
        local16 = $00
        For local4 = Each TX2BF6X0FF4
            If (local4\Field38 <> Null) Then
                local16 = (local16 + $01)
                If (((local16 > (T84F6Z402D\Field1 Shl $03)) And (local16 <= ((T84F6Z402D\Field1 + $01) Shl $03))) <> 0) Then
                    local15 = Y0Z22266Z4(local4, local15, local11, local12, local8, local0, local2, arg0)
                EndIf
            EndIf
        Next
        For local4 = Each TX2BF6X0FF4
            If (local4\Field38 = Null) Then
                local16 = (local16 + $01)
                If (((local16 > (T84F6Z402D\Field1 Shl $03)) And (local16 <= ((T84F6Z402D\Field1 + $01) Shl $03))) <> 0) Then
                    local15 = Y0Z22266Z4(local4, local15, local11, local12, local8, local0, local2, arg0)
                EndIf
            EndIf
        Next
        If (AD6628F0D <> Null) Then
            setfontex(XD00026ZX2\Field0[$00])
            local17 = XX8XZZFFF(XX226ZZXZB(AD6628F0D\Field2, AD6628F0D\Field1, AD6628F0D\Field4))
            local18 = (stringwidth(replace(local17, chr($03), "X")) + (Int (12.0 * menuscale)))
            local19 = (stringheight(local17) + (Int (12.0 * menuscale)))
            local20 = (((T2XDZFBBBZ Sar $01) + Y68BX8F44) - (local18 Sar $01))
            local21 = ((B0D0444FB + EBB4F42D2) + (Int (5.0 * menuscale)))
            color($14, $14, $14, $FF)
            rect(local20, local21, local18, local19, $01)
            local22 = ((Float millisecs()) * 0.15)
            local23 = ((sin(local22) + 1.0) * 0.5)
            color((Int ((55.0 * local23) + 200.0)), (Int ((85.0 * local23) + 150.0)), (Int ((40.0 * local23) + 10.0)), $FF)
            rect(local20, local21, local18, local19, $00)
            color($FF, $FF, $FF, $FF)
            X44ZBBZ44X((Float ((Int (6.0 * menuscale)) + local20)), (Float ((Int (6.0 * menuscale)) + local21)), local17, $00, $00, 1.0, $00, 0.0)
        EndIf
    EndIf
    Return $00
End Function
