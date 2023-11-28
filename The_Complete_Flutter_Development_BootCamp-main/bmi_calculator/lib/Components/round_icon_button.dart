import 'package:flutter/material.dart';

class RoundActionButton extends StatelessWidget {
  final IconData icon;
  final VoidCallback onPressed;
  RoundActionButton({required this.icon, required this.onPressed});

  @override
  Widget build(BuildContext context) {
    return RawMaterialButton(
      onPressed: onPressed,
      child: Icon(icon),
      constraints: BoxConstraints.tightFor(
        width: 56.0,
        height: 56.0,
      ),
      elevation: 6,
      shape: CircleBorder(),
      fillColor: Color(0xFF4C4F5E),
    );
  }
}
