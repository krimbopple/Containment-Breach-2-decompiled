Function GUESSEDsetcolor_3%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5.TX2BF6X0FF4
    Local local6#
    Local local7#
    Local local8#
    local0 = GUESSEDupdateitems_2()
    local1 = (Int (300.0 * menuscale))
    local2 = (Int (30.0 * menuscale))
    local3 = (Int ((Float (opt\Field21 - local1)) - (20.0 * menuscale)))
    local4 = (Int ((Float opt\Field46) / 2.0))
    For local5 = Each TX2BF6X0FF4
        If (((local5\Field10\Field3 > local0) And local5\Field10\Field8) <> 0) Then
            local4 = (Int ((Float local4) - (((Float local2) - (8.0 * menuscale)) / 2.0)))
        EndIf
    Next
    For local5 = Each TX2BF6X0FF4
        If (((local5\Field10\Field3 > local0) And local5\Field10\Field8) <> 0) Then
            local6 = GUESSEDcreatebank_4(local5\Field10\Field7[$01])
            local7 = GUESSEDcreatebank_4(local5\Field10\Field7[$02])
            local8 = local5\Field10\Field9
            If (local6 < local7) Then
                local6 = local7
            EndIf
            If (local6 < local8) Then
                local6 = local8
            EndIf
            color($00, $00, $00, $60)
            rect((local3 + $01), (local4 + $01), (local1 - $01), (local2 - $01), $01)
            color($80, $80, $80, (Int (128.0 * local6)))
            rect((local3 + $01), (local4 + $01), (local1 - $01), (local2 - $01), $01)
            setfontex(XD00026ZX2\Field0[$00])
            color($C8, $C8, $C8, $FF)
            text((Int (((Float local1) / 2.0) + (Float local3))), (Int (((Float local2) / 2.0) + (Float local4))), ((("(" + (Str local5\Field13)) + ") ") + left(local5\Field27, $1A)), $01, $01)
            setfontex(XD00026ZX2\Field0[$09])
            color($C8, $C8, $C8, $FF)
            text((Int ((12.0 * menuscale) + (Float local3))), (Int (((Float local2) / 2.0) + (Float local4))), "A", $00, $01)
            color($C8, $C8, $C8, $FF)
            rect(local3, local4, local1, local2, $00)
            local4 = (Int ((8.0 * menuscale) + (Float (local4 + local2))))
        EndIf
    Next
    Return $00
End Function
