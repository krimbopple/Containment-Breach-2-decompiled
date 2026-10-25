Function GUESSEDsetcolor_2%()
    Local local0#
    Local local1#
    Local local2$
    Local local3%
    Local local4%
    If (GUESSEDrenderrendergui_2() <> 0) Then
        If (230.0 > DZ64X028\Field22) Then
            local0 = max(XZ0260X8X2\Field76, ((Float (0.0 >= XZ0260X8X2\Field22)) * 0.045))
            DZ64X028\Field9 = GUESSEDrenderrendergui_3(max(-20.0, min((((DZ64X028\Field25 * 15.0) + (min(((local0 * 66.0) * 10.0), 40.0) / 2.0)) - ((Float XZ0260X8X2\Field25) * 4.0)), 190.0)), DZ64X028\Field9, 4.0, MP_GetLoadingProgress())
            local1 = (10.0 * menuscale)
            If (DZ64X028\Field18\Field3\Field60 > $00) Then
                color($C8, ((0.0 >= DZ64X028\Field26) * $C8), ((0.0 >= DZ64X028\Field26) * $C8), (Int (max((((255.0 - DZ64X028\Field22) - DZ64X028\Field66) - (XZ0260X8X2\Field81 * 637.5)), 0.0) * 0.707)))
                local1 = ((local1 * 4.0) + (DZ64X028\Field9 * 0.5))
                GUESSEDdrawoval((Int ((Float (opt\Field21 Sar $01)) - (local1 / 2.0))), (Int ((Float (opt\Field46 Sar $01)) - (local1 / 2.0))), (Int local1), (Int local1), $00)
            Else
                color($C8, ((0.0 >= DZ64X028\Field26) * $C8), ((0.0 >= DZ64X028\Field26) * $C8), (Int max((((255.0 - DZ64X028\Field22) - DZ64X028\Field66) - (XZ0260X8X2\Field81 * 637.5)), 0.0)))
                GUESSEDdrawscaledrect((Int (((Float (opt\Field21 Sar $01)) - (local1 * 2.0)) - DZ64X028\Field9)), (opt\Field46 Sar $01), (Int local1), $01, $01, 0.6, $01)
                GUESSEDdrawscaledrect((Int (((Float (opt\Field21 Sar $01)) + local1) + DZ64X028\Field9)), (opt\Field46 Sar $01), (Int local1), $01, $01, 0.6, $01)
                GUESSEDdrawscaledrect((opt\Field21 Sar $01), (Int (((Float (opt\Field46 Sar $01)) - (local1 * 2.0)) - DZ64X028\Field9)), $01, (Int local1), $01, 0.6, $01)
                GUESSEDdrawscaledrect((opt\Field21 Sar $01), (Int (((Float (opt\Field46 Sar $01)) + local1) + DZ64X028\Field9)), $01, (Int local1), $01, 0.6, $01)
            EndIf
        EndIf
        If (DZ64X028\Field18\Field3\Field52 > $00) Then
            setfontex(XD00026ZX2\Field0[$00])
            local2 = (((Str (Int DZ64X028\Field61\Field15)) + " / ") + (Str (Int DZ64X028\Field61\Field3)))
            local3 = (Int (((Float (opt\Field21 - stringwidth(local2))) - (70.0 * menuscale)) - (10.0 * menuscale)))
            local4 = ((Int ((Float opt\Field21) - (60.0 * menuscale))) - local3)
            color((Int (60.0 - (min((DZ64X028\Field61\Field15 / (Float DZ64X028\Field18\Field3\Field52)), 1.0) * 60.0))), $00, $00, $80)
            rect(local3, (Int ((Float opt\Field46) - (50.0 * menuscale))), (local4 + $00), (Int (40.0 * menuscale)), $01)
            color($C8, $C8, $C8, $FF)
            textex((Int ((10.0 * menuscale) + (Float local3))), (Int ((Float opt\Field46) - (30.0 * menuscale))), local2, $00, $01)
            drawimage(X2Z260BF0Z\Field3[$11], (Int ((Float opt\Field46) - (50.0 * menuscale))), $00, $00)
            color($C8, $C8, $C8, $FF)
            rect(local3, (Int ((Float opt\Field46) - (50.0 * menuscale))), (Int ((Float opt\Field21) - (60.0 * menuscale))), (Int (40.0 * menuscale)), $00)
            rect((Int ((Float opt\Field21) - (60.0 * menuscale))), (Int ((Float opt\Field46) - (50.0 * menuscale))), (Int (40.0 * menuscale)), (Int (40.0 * menuscale)), $00)
        EndIf
    EndIf
    Return $00
End Function
