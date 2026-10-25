Function GUESSEDsetfdf%(arg0.TX2BF6X0FF4)
    Local local0%
    Local local1.Z6ZDXXD84
    Local local2$
    Local local3$
    Local local4#
    Local local5#
    Local local6#
    Local local7%
    Local local8%
    For local1 = Each Z6ZDXXD84
        If (((local1\Field3 = arg0\Field21\Field0) And (local1\Field0 = arg0\Field21\Field2)) <> 0) Then
            arg0\Field38 = local1
            Exit
        EndIf
    Next
    If (arg0\Field43[$02]\Field2 = "") Then
        GUESSEDcheckvalue_40(arg0, $02, "PTAG_INVISIBLE")
        If (arg0\Field38 <> Null) Then
            GUESSEDcheckvalue_49(arg0, $01, 0.87)
            GUESSEDcheckvalue_40(arg0, $02, arg0\Field38\Field2)
            GUESSEDcheckvalue_37(arg0, $02, arg0\Field38\Field1, arg0\Field38\Field4)
        EndIf
    EndIf
    For local0 = $00 To $05 Step $01
        local2 = blitz_T2X820D0FD0()
        If (((len(local2) = $00) And (local0 = $02)) = 0) Then
            GUESSEDcheckvalue_40(arg0, local0, local2)
            If (len(local2) > $00) Then
                local3 = blitz_T2X820D0FD0()
                local4 = blitz_TX488420F440()
                local5 = blitz_TX488420F440()
                local6 = blitz_TX488420F440()
                local7 = blitz_T20024FDF4X0()
                local8 = blitz_T20024FDF4X0()
                GUESSEDcheckvalue_33(arg0, local0, local3)
                GUESSEDcheckvalue_42(arg0, local0, local4, local5)
                GUESSEDcheckvalue_49(arg0, local0, local6)
                GUESSEDcheckvalue_37(arg0, local0, local7, local8)
            EndIf
        EndIf
    Next
    Return $00
End Function
