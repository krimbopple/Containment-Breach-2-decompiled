Function GUESSEDfreeentity%(arg0%)
    Local local0.items
    Local local2%
    Local local3%
    Local local4%
    Local local5#
    Local local6#
    Local local7#
    Local local8#
    Local local9#
    Local local10#
    Local local11#
    Local local12#
    Local local13#
    Local local14#
    Local local15#
    Local local16#
    Local local17#
    Local local18#
    Local local19#
    Local local20#
    GUESSEDgetmap($00, arg0)
    local0 = eax_0001
    Select blitz_TX28D20DD080()
        Case $00
            local2 = blitz_T20024FDF4X0()
            local3 = blitz_T20024FDF4X0()
            local4 = blitz_TX28D20DD080()
            If ((((local0 = Null) Lor (local0\Field6\Field23 <> local2)) Lor (local0\Field27 <> arg0)) <> 0) Then
                If (local0 <> Null) Then
                    removeitem(local0, $00)
                EndIf
                local0 = GUESSEDcreateitem(local2, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
                entitytype(local0\Field9, $03, $00)
                GUESSEDloadgame(local0, arg0)
                local0\Field26 = 0.0
                If (((local4 = GUESSEDupdatedropitem()) And (local3 = $00)) <> 0) Then
                    local0\Field21 = $01
                EndIf
            EndIf
            local0\Field42 = $01
            If (local3 = $00) Then
                GUESSEDsetentity_5(local0, local4)
            EndIf
            local0\Field13 = local4
            local0\Field40 = local3
        Case $01
            local5 = blitz_TX488420F440()
            local6 = blitz_TX488420F440()
            local7 = blitz_TX488420F440()
            local8 = GUESSEDcallclamp_6(blitz_XXXBBZ4F2Z0(), 50.0)
            local9 = GUESSEDcallclamp_6(blitz_XXXBBZ4F2Z0(), 50.0)
            local10 = GUESSEDcallclamp_6(blitz_XXXBBZ4F2Z0(), 50.0)
            local11 = GUESSEDcallclamp_6(blitz_XXXBBZ4F2Z0(), 100.0)
            local12 = GUESSEDcallclamp_6(blitz_XXXBBZ4F2Z0(), 100.0)
            local13 = GUESSEDcallclamp_6(blitz_XXXBBZ4F2Z0(), 100.0)
            If (local0 = Null) Then
                Return $00
            EndIf
            local0\Field43 = local5
            local0\Field4 = local6
            local0\Field37 = local7
            If (0.0 < local0\Field26) Then
                Return $00
            EndIf
            local14 = (local5 - entityx(local0\Field9, $01, 1.0))
            local15 = (local6 - entityy(local0\Field9, $01, 1.0))
            local16 = (local7 - entityz(local0\Field9, $01, 1.0))
            If (2.0 < (((local14 * local14) + (local15 * local15)) + (local16 * local16))) Then
                positionentity(local0\Field9, local5, local6, local7, $01)
                rotateentity(local0\Field9, 0.0, entityyaw(local0\Field9, $00, 1.0), 0.0, $00)
                entitylinearvelocity(local0\Field9, local8, local9, local10)
                entityangularvelocity(local0\Field9, 0.0, 0.0, 0.0)
            Else
                local17 = clamp((((Float GUESSEDgetarray_6($01)) / 2.0) / 1000.0), 0.0, 0.2)
                local5 = ((local8 * local17) + local5)
                local6 = ((local9 * local17) + local6)
                local7 = ((local10 * local17) + local7)
                local18 = (local5 - entityx(local0\Field9, $01, 1.0))
                local19 = (local6 - entityy(local0\Field9, $01, 1.0))
                local20 = (local7 - entityz(local0\Field9, $01, 1.0))
                entitylinearvelocity(local0\Field9, ((local18 * 2.0) + local8), ((local19 * 2.0) + local9), ((local20 * 2.0) + local10))
            EndIf
            entityangularvelocity(local0\Field9, local11, local12, local13)
            entityfreeze(local0\Field9, $00)
            If (0.1 < (((Abs local8) + (Abs local9)) + (Abs local10))) Then
                local0\Field41 = 35.0
            Else
                local0\Field41 = 0.0
            EndIf
    End Select
    Return $00
End Function
