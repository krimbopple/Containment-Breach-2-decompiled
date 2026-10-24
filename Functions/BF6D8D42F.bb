Function BF6D8D42F%()
    Local local0%
    Local local1.TX2BF6X0FF4
    Local local2#
    Local local3%
    Local local4#
    Local local5#
    Local local6#
    If (TXXZZZ42Z68() = $00) Then
        Return $00
    EndIf
    local0 = T2FFB8B2F0()
    For local1 = Each TX2BF6X0FF4
        If (local1\Field10\Field3 < local0) Then
            XZBD2FXX0X(local1, $01, "")
            local1\Field10\Field0 = 1.0
        ElseIf (local0 > local1\Field10\Field1) Then
            local1\Field10\Field1 = (local0 + $32)
            local2 = 0.0
            For local3 = $00 To $02 Step $01
                local4 = TDXXZ0ZZZD(local1\Field10\Field7[local3])
                If (local2 < local4) Then
                    local2 = local4
                EndIf
            Next
            local5 = 1.0
            If (0.015 < local2) Then
                local5 = clamp((0.22 / local2), 0.2, 4.0)
            EndIf
            local1\Field10\Field0 = (local1\Field10\Field0 + ((local5 - local1\Field10\Field0) * 0.25))
        EndIf
        local6 = (((opt\Field41 * opt\Field2) * local1\Field10\Field4) * local1\Field10\Field0)
        TXB86X4FDDF(local1\Field10\Field7[$00], $02, ((max((1.0 - (entitydistance(local1\Field52, camera) / 15.0)), 0.0) * 5.0) * local6))
        X4F0X4B080(local1\Field10\Field7[$00], entityx(local1\Field52, $00, 1.0), entityy(local1\Field52, $00, 1.0), entityz(local1\Field52, $00, 1.0))
        For local3 = $01 To $02 Step $01
            TXB86X4FDDF(local1\Field10\Field7[local3], $02, local6)
        Next
    Next
    T2X2880X642(camera)
    T6Z0F2D60F()
    Return $00
End Function
