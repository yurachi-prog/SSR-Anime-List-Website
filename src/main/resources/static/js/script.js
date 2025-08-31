function showSection(sectionName) {
    // Hide all sections
    document.getElementById('home-section').classList.add('hidden');
    document.getElementById('anime-section').classList.add('hidden');
    document.getElementById('manga-section').classList.add('hidden');
    
    // Show selected section
    document.getElementById(sectionName + '-section').classList.remove('hidden');
    
    // Update active navigation
    document.querySelectorAll('.nav-btn').forEach(btn => btn.classList.remove('active'));
    event.target.classList.add('active');
}

// Add some interactive effects
document.addEventListener('DOMContentLoaded', function() {
    document.querySelectorAll('.collection-card').forEach(card => {
        card.addEventListener('mouseenter', function() {
            this.style.transform = 'translateY(-10px) scale(1.02)';
        });
        
        card.addEventListener('mouseleave', function() {
            this.style.transform = 'translateY(0) scale(1)';
        });
    });

    // Smooth scroll behavior
    document.documentElement.style.scrollBehavior = 'smooth';
});