Function CDF6Z4ZDZ%(arg0.T484FFBZX, arg1%, arg2%)
    Local local0%
    Local local2.TX2BF6X0FF4
    Local local3.doors
    Local local4%
    Local local5%
    Local local6%
    local0 = $00
    TXXF80Z0FD0(arg0, arg1)
    Select arg1
        Case $01
            For local2 = Each TX2BF6X0FF4
                If ((arg2 Lor local2\Field9) <> 0) Then
                    TD66X8880X(arg0, local2)
                    local0 = $01
                    If (arg2 = $00) Then
                        local2\Field9 = $00
                    EndIf
                EndIf
            Next
            TXXF80Z0FD0(arg0, $00)
        Case $02
            For local3 = Each doors
                If (local3\Field30 = $00) Then
                    local4 = (Int (((((Float ((((local3\Field39 = $01) + ((local3\Field21 = $01) Shl $01)) + (local3\Field20 Shl $02)) + ((local3\Field49 <> $00) Shl $03))) + (max((Float (local3\Field49 - $01)), 0.0) * 16.0)) + (Float (local3\Field43 Shl $05))) + (Float (local3\Field5 Shl $06))) + (Float ((local3\Field21 = $02) Shl $07))))
                    local5 = (Int ((Float (((local3\Field4 + (local3\Field12 Shl $01)) + ((local3\Field27 <> $00) Shl $02)) + (local3\Field38 Shl $04))) + (local3\Field54 * 32.0)))
                    local6 = (local4 Or (local5 Shl $08))
                    If ((arg2 Lor (local3\Field42 <> local6)) <> 0) Then
                        T2DD0DZDD4(arg0, local3\Field36)
                        TXXF80Z0FD0(arg0, local4)
                        TXXF80Z0FD0(arg0, local5)
                        local0 = $01
                        If (arg2 = $00) Then
                            local3\Field42 = local6
                        EndIf
                    EndIf
                EndIf
            Next
            T2DD0DZDD4(arg0, $00)
    End Select
    Return local0
    Return $00
End Function
