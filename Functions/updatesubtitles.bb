Function updatesubtitles%()
    Local local0.queuedsubtitlesmsg
    Local local1.subtitlesmsg
    Local local2%
    Local local3%
    Local local4$
    Local local5%
    Local local6#
    Local local7$
    Local local8$
    Local local9#
    Local local10.subtitlesmsg
    Local local11#
    If (((selecteddifficulty\Field7 = difficulties[$03]\Field7) Lor (opt\Field53 = $00)) <> 0) Then
        Return $00
    EndIf
    local2 = (Int (10.0 * menuscale))
    local3 = (XZ0260X8X2\Field40 <> $FFFFFFFF)
    For local0 = Each queuedsubtitlesmsg
        If (0.0 < local0\Field2) Then
            local0\Field2 = (local0\Field2 - fps\Field3[local3])
        Else
            local4 = local0\Field5
            local5 = $00
            local1 = (Last subtitlesmsg)
            While (len(local4) > $00)
                local6 = ((subassets\Field2 + (Float local2)) + (Float stringwidth(local4)))
                If (local6 > ((subassets\Field2 + subassets\Field4) - (Float local2))) Then
                    local7 = ""
                    While (local6 > ((subassets\Field2 + subassets\Field4) - (Float local2)))
                        local7 = (right(local4, $01) + local7)
                        local4 = left(local4, (Int max((Float (len(local4) - $01)), 0.0)))
                        local6 = ((subassets\Field2 + (Float local2)) + (Float stringwidth(local4)))
                    Wend
                    local8 = local4
                    While (right(local4, $01) <> " ")
                        local7 = (right(local4, $01) + local7)
                        local4 = left(local4, (Int max((Float (len(local4) - $01)), 0.0)))
                        local9 = ((subassets\Field2 + (Float local2)) + (Float stringwidth(local7)))
                        If (local9 > ((subassets\Field2 + subassets\Field4) - (Float local2))) Then
                            While (local9 > ((subassets\Field2 + subassets\Field4) - (Float local2)))
                                local4 = (right(local7, $01) + local4)
                                local7 = left(local7, (len(local7) - $01))
                                local9 = ((subassets\Field2 + (Float local2)) + (Float stringwidth(local7)))
                            Wend
                            Exit
                        EndIf
                        If (local4 = "") Then
                            local4 = local8
                            Exit
                        EndIf
                    Wend
                    If (local5 <> 0) Then
                        local1\Field9 = (local1\Field9 - (Float subassets\Field5))
                        local1\Field5 = (local1\Field5 - (Float subassets\Field5))
                        If ((Before local1) <> Null) Then
                            local1 = (Before local1)
                        EndIf
                    EndIf
                    createsubtitlesmsg(local0\Field0, local0\Field1, trim(local4), local0\Field3, local0\Field7, local0\Field6, local0\Field4)
                    local5 = $01
                    local4 = local7
                Else
                    createsubtitlesmsg(local0\Field0, local0\Field1, trim(local4), local0\Field3, local0\Field7, local0\Field6, local0\Field4)
                    local4 = ""
                EndIf
            Wend
            Delete local0
        EndIf
    Next
    local11 = (fps\Field3[local3] / 7.0)
    For local10 = Each subtitlesmsg
        If ((Float len(local10\Field7)) > local10\Field2) Then
            local10\Field2 = (fps\Field3[local3] + local10\Field2)
            local10\Field1 = left(local10\Field7, (Int floor(local10\Field2)))
        EndIf
        local10\Field3 = (local10\Field3 - fps\Field3[local3])
        If (0.0 > local10\Field3) Then
            local10\Field10 = max((local10\Field10 - local11), 0.0)
            If (0.0 >= local10\Field10) Then
                Delete local10
            EndIf
        Else
            local10\Field10 = min(1.0, (local10\Field10 + local11))
        EndIf
    Next
    Return $00
End Function
