Function showroomsnocoll%(arg0.rooms)
    Local local0%
    Local local1.props
    Local local2.doors
    Local local3.securitycams
    Local local4.levers
    Local local5.screens
    If (entityhidden(arg0\Field15) <> 0) Then
        For local1 = Each props
            If (local1\Field5 = arg0) Then
                showentity(local1\Field0)
            EndIf
        Next
        For local2 = Each doors
            If (local2\Field32 = arg0) Then
                showentity(local2\Field0)
                If (local2\Field7 <> $00) Then
                    showentity(local2\Field7)
                EndIf
                For local0 = $00 To $01 Step $01
                    If (local2\Field40[local0] <> $00) Then
                        showentity(local2\Field40[local0])
                    EndIf
                    If (local2\Field24[local0] <> $00) Then
                        showentity(local2\Field24[local0])
                    EndIf
                Next
                showentity(local2\Field51)
            EndIf
        Next
        For local3 = Each securitycams
            If (local3\Field6 = arg0) Then
                If (local3\Field15 <> $00) Then
                    If (local3\Field5 = $00) Then
                        showentity(local3\Field15)
                    EndIf
                EndIf
                If (local3\Field10 = $00) Then
                    showentity(local3\Field7)
                    showentity(local3\Field0)
                EndIf
            EndIf
        Next
        For local4 = Each levers
            If (local4\Field2 = arg0) Then
                showentity(local4\Field1)
                showentity(local4\Field0)
            EndIf
        Next
        For local5 = Each screens
            If (local5\Field12 = arg0) Then
                showentity(local5\Field10)
            EndIf
        Next
        For local0 = $00 To $1D Step $01
            If (arg0\Field27[local0] <> $00) Then
                If (arg0\Field30[local0] = $00) Then
                    showentity(arg0\Field27[local0])
                EndIf
            EndIf
        Next
        showentity(arg0\Field15)
        Return $01
    EndIf
    Return $00
    Return $00
End Function
