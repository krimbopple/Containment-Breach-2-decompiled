Function GUESSEDdeleteentity_8%(arg0.rooms)
    Local local0%
    Local local1.XF808F44XB
    Local local2%
    Local local3#
    Local local4#
    Local local5#
    Local local6#
    Local local7#
    Local local8#
    local0 = $00
    For local2 = $00 To $1D Step $01
        If (arg0\Field27[local2] <> $00) Then
            local0 = arg0\Field27[local2]
            local1 = arg0\Field20[local2]
            local3 = entityx(local0, $01, 1.0)
            local4 = entityy(local0, $01, 1.0)
            local5 = entityz(local0, $01, 1.0)
            local6 = entitypitch(local0, $01, 1.0)
            local7 = entityyaw(local0, $01, 1.0)
            local8 = entityroll(local0, $01, 1.0)
            If (local1 = Null) Then
                local1 = (New XF808F44XB)
                local1\Field16 = local3
                local1\Field17 = local4
                local1\Field14 = local5
                local1\Field8 = local6
                local1\Field12 = local7
                local1\Field2 = local8
                local1\Field6 = local1\Field16
                local1\Field11 = local1\Field17
                local1\Field4 = local1\Field14
                local1\Field10 = local1\Field8
                local1\Field15 = local1\Field12
                local1\Field13 = local1\Field2
                local1\Field5 = $00
                local1\Field1 = local2
                local1\Field0 = arg0
                arg0\Field20[local2] = local1
            ElseIf (local1\Field3 = $00) Then
                local1\Field5 = ((((((local3 <> local1\Field16) + ((local4 <> local1\Field17) Shl $01)) + ((local5 <> local1\Field14) Shl $02)) + ((local6 <> local1\Field8) Shl $03)) + ((local7 <> local1\Field12) Shl $04)) + ((local8 <> local1\Field2) Shl $05))
                If (local1\Field5 > $00) Then
                    local1\Field7 = $01
                EndIf
            EndIf
        ElseIf (arg0\Field20[local2] <> Null) Then
            Delete arg0\Field20[local2]
        EndIf
    Next
    Return $00
End Function
