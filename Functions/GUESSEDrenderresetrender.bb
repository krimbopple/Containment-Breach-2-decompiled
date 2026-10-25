Function GUESSEDrenderresetrender%(arg0%)
    Local local1.props
    Local local2.items
    Local local3.TX2BF6X0FF4
    Local local4.npcs
    Local local5.T202XXZ0BFD
    Select arg0
        Case $00,$01
        Case $02
            For local1 = Each props
                If (local1\Field0 <> $00) Then
                    GUESSEDloadmask(local1\Field0, $00)
                EndIf
            Next
            For local2 = Each items
                If (local2\Field5 <> $00) Then
                    GUESSEDloadmask(local2\Field5, $00)
                EndIf
            Next
            For local3 = Each TX2BF6X0FF4
                If (local3\Field55\Field7 <> $00) Then
                    GUESSEDloadmask(local3\Field55\Field7, $00)
                EndIf
            Next
            For local4 = Each npcs
                If (local4\Field98 <> $00) Then
                    GUESSEDloadmask(local4\Field98, $00)
                EndIf
                If (local4\Field101 <> $00) Then
                    GUESSEDloadmask(local4\Field101, $00)
                EndIf
            Next
            For local5 = Each T202XXZ0BFD
                If (local5\Field0 <> $00) Then
                    GUESSEDloadmask(local5\Field0, $00)
                EndIf
            Next
        Case $03
            For local1 = Each props
                If (local1\Field0 <> $00) Then
                    GUESSEDloadmask(local1\Field0, (local1\Field1 = $00))
                EndIf
            Next
            For local2 = Each items
                If (local2\Field5 <> $00) Then
                    GUESSEDloadmask(local2\Field5, $01)
                EndIf
            Next
            For local3 = Each TX2BF6X0FF4
                If (local3\Field55\Field7 <> $00) Then
                    GUESSEDloadmask(local3\Field55\Field7, $00)
                EndIf
            Next
            For local4 = Each npcs
                If (local4\Field98 <> $00) Then
                    GUESSEDloadmask(local4\Field98, $00)
                EndIf
                If (local4\Field101 <> $00) Then
                    GUESSEDloadmask(local4\Field101, $00)
                EndIf
            Next
            For local5 = Each T202XXZ0BFD
                If (local5\Field0 <> $00) Then
                    GUESSEDloadmask(local5\Field0, $01)
                EndIf
            Next
        Case $04
            For local1 = Each props
                If (local1\Field0 <> $00) Then
                    GUESSEDloadmask(local1\Field0, (local1\Field1 = $00))
                EndIf
            Next
            For local2 = Each items
                If (local2\Field5 <> $00) Then
                    GUESSEDloadmask(local2\Field5, $01)
                EndIf
            Next
            For local3 = Each TX2BF6X0FF4
                If (local3\Field55\Field7 <> $00) Then
                    GUESSEDloadmask(local3\Field55\Field7, $01)
                EndIf
            Next
            For local4 = Each npcs
                If (local4\Field98 <> $00) Then
                    GUESSEDloadmask(local4\Field98, $01)
                EndIf
                If (local4\Field101 <> $00) Then
                    GUESSEDloadmask(local4\Field101, $01)
                EndIf
            Next
            For local5 = Each T202XXZ0BFD
                If (local5\Field0 <> $00) Then
                    GUESSEDloadmask(local5\Field0, $01)
                EndIf
            Next
    End Select
    Return $00
End Function
